import React from "react";
import Styles from '../css/style.module.css'
const Main=(props)=>{
return(
    <div className={Styles.main}>
        {props.children}
    </div>
);
}
export default Main;