const mongoose = require('mongoose');


const JokeSchema = new mongoose.Schema({

    setup: {
        type: String,
        required: [true,"required"],
        minLength: [10,"setup should be at least 10 characters"],
    },
    punchline: {
        type: String,
        required: true,
        minLength: [3,"punchline should be at least 3 characters"],
    }

});


const Joke = mongoose.model('Joke', JokeSchema);


module.exports = Joke;