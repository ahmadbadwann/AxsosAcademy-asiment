import {useState} from 'react'
import './App.css'
import InputField from "./components/InputField.jsx";
import axios from "axios";

function App() {
    const [title, setTitle] = useState("")
    const [description, setDescription] = useState()
    const [price, setPrice] = useState(0)

    function handleSubmit(e) {
        e.preventDefault()
        const data = {
            title : title,
            description : description,
            price : price
        }
        axios.post("http://localhost:8000/api/products", {data}).then(r =>{
            console.log(r)
        })
    }
    return (
        <>
            <form onSubmit={handleSubmit}>
                <InputField type={"text"} label={"title"} data={title} onChange={setTitle}/>
                <InputField type={"number"} label={"price"} data={price} onChange={setPrice}/>
                <InputField type={"text"} label={"description"} data={description} onChange={setDescription}/>
                <button type="submit">Submit</button>
            </form>
        </>
    )
}

export default App