import React from "react";

const Parson = (props) =>{

    const {firstname,lastname,age,hearcoler}=props;
    return(
        
        <>
            <h1>{firstname}</h1>
            <h2>{lastname}</h2>
            <p>{age}</p>
            <p>{hearcoler}</p>
        </>
    )

}
export default Parson;