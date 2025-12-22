import { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate,useLocation } from "react-router-dom";

const ProductData = () => {
    const location = useLocation();
    const {id} = location.state
    const navigate = useNavigate();
    const [product, setProduct] = useState(null);

    useEffect(() => {
        axios.get(`http://localhost:8000/api/products/${id}`)
            .then(res => setProduct(res.data));
    }, [id]);

    if (!product) return <p>Loading...</p>;

    return (
        <div>
            <h1>{product.title}</h1>
            <h2>{product.price}</h2>
            <p>{product.description}</p>

            <button onClick={() => navigate("/")}>
                Go back
            </button>
        </div>
    );
};

export default ProductData;