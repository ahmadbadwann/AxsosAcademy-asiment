require('dotenv').config();
const express = require("express");
const app = express();
const port = process.env.PORT;

require("./config/mongoose.db");
const cors = require("cors");w=

app.use(express.json(), express.urlencoded({ extended: true }),cors());

require("./routes/products.routes")(app);




app.listen(port, () => console.log(`Listening on port: ${port}`) );