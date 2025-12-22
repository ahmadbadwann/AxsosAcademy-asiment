const mongoose = require('mongoose')

const products_schema = new mongoose.Schema( {
    title: String,
    price: Number,
    description: String,
})

const Product = mongoose.model('Product', products_schema);

module.exports = Product;