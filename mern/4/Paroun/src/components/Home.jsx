import React, { useState } from "react";

const Home = (props) =>{
    const {farstname,lastname,hiar,age}=props;
    const [getAge,setAge]=useState(age)
    const changeAge=()=>{
        setAge(1+getAge)
    }
return(
    <>
        <h1> {lastname}, {farstname} </h1>
        <h2> Age:{getAge} </h2>
        <h2> hare coler : {hiar} </h2>
        <button onClick={changeAge}>barthday button for {farstname} {lastname}</button>
    </>
)

}


export default Home;