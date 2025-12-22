const Joke = require('../models/jokes.model');


module.exports.findAllJokes = (req, res) => {
    console.log("im heeeeeeeeeeeeeereeeeeeeeeeeeeee")
    return Joke.find().then(jokes => {
        return res.json(jokes);
    })
}


module.exports.findOneSingleJoke = (req, res) => {
    Joke.findOne({_id: req.params.id}).then((joke) => {
        return res.json(joke);
    })
}


module.exports.createNewJoke = (req, res) => {

    Joke.create(req.body)
        .then(newlyCreatedJoke => {
            res.json({joke: newlyCreatedJoke})
        })
        .catch((err) => {
            res.json(err)
        });
}


module.exports.updateExistingJoke = (req, res) => {
    Joke.findByIdAndUpdate(
        req.params.id,
        req.body,
        { new: true, runValidators: true }
    )
        .then(updated => res.json(updated))
        .catch(err => res.status(400).json({ message: "Error", err }));
};



module.exports.deleteAnExistingJoke = (req, res) => {
    Joke.deleteOne({_id: req.params.id}).then((result) => {
        return res.json(result)
    })
}