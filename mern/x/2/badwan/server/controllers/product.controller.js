const Product = require('../models/products.model')

module.exports.getAllProducts = async (req, res) => {
    Product.find().then(products => {
        res.json(products);
    })
}

module.exports.getProduct = async (req, res) => {
    console.log(req.params)
    Product.findById(req.params.id).then((product) => {
        res.json(product);
    })
}

module.exports.createProduct = async (req, res) => {
    console.log(req.body);
    Product.create(req.body.data).then((product) => {
        res.json(product);
    })
}