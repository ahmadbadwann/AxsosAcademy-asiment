import React, { useState } from 'react'
import { useParams } from 'react-router-dom';

export default function Index(props) {    
    const [search,setSearch]=useState("");
    const [id,setId]=useState("");
    const onsubmit = (e)=>{
        e.preventDefault();
        navigate("/Home/bido");
    }
    return (
        <>
        <div>

            <div>
                <label>search for :</label>
                <select name="" id="" onChange={(e)=>{setSearch(e.target.value)}}  >
                    <option value="people">people</option>
                    <option value="planets">planets</option>
                </select>
            </div>

            <div>
                <label>Id:</label>
                <input type="text" onChange={(e)=>{setId(e.target.value)}} />
            </div>

            <button onClick={}>Search</button>

        </div>
        </>
    );
}
