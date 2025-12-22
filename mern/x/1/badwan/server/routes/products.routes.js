const productController = require('../controllers/product.controller')

module.exports = app => {
    app.get('/api/products', productController.getAllProducts)
    app.post('/api/products', productController.createProduct)
};