import { useEffect, useState } from "react";
import './App.css'
import { Routes, Route, Link } from "react-router-dom";
import axios from "axios";
import InputField from "./components/InputField.jsx";
import ProductData from "./components/productData.jsx";

function App() {
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");
    const [price, setPrice] = useState("");
    const [products, setProducts] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8000/api/products")
            .then(res => setProducts(res.data));
    }, []);

    function handleSubmit(e) {
        e.preventDefault();
        axios.post("http://localhost:8000/api/products", {
            title,
            description,
            price
        }).then(() => {
            return axios.get("http://localhost:8000/api/products");
        }).then(res => setProducts(res.data));
    }

    return (
        <Routes>
            <Route
                path="/"
                element={
                    <>
                        <form onSubmit={handleSubmit}>
                            <InputField type="text" label="Title" data={title} onChange={setTitle} />
                            <InputField type="number" label="Price" data={price} onChange={setPrice} />
                            <InputField type="text" label="Description" data={description} onChange={setDescription} />
                            <button type="submit">Submit</button>
                        </form>

                        <ul>
                            {products.map((product,index) => (
                                <li key={product._id}>
                                    <Link state={{id: product._id}} to={`/products/${index}`}>
                                        {product.title}
                                    </Link>
                                </li>
                            ))}
                        </ul>
                    </>
                }
            />

            <Route path="/products/:id" element={<ProductData />} />
        </Routes>
    );
}

export default App;