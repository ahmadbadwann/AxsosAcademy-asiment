const productController = require('../controllers/product.controller')

module.exports = app => {
    app.get('/api/products', productController.getAllProducts)
    app.get('/api/products/:id', productController.getProduct)
    app.post('/api/products', productController.createProduct)
};