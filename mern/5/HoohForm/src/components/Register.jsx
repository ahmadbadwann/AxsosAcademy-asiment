import { useState } from "react";

function Register() {
    const [fName,setFname] = useState("")
    const [lName,setLname] = useState("")
    const [Email,setEmail] = useState("")
    const [Password,setPassword] = useState("")
    const [fNameerror,setFnameerror]=useState(false)
    const [lNameerror,setLnameerror]=useState(false)
    const [Emailerror,setEmailerror]=useState(false)
    const [Passworderror,setPassworderror]=useState(false)
    const [CPassworderror,setCPassworderror]=useState(false)


    const vallName=(e)=>{
        e.preventDefault();
        if(e.target.value.length<=2 && e.target.value.length !=0){
            setFnameerror(true)
        }else{
            setFnameerror(false)
        }
    }


        const vallLName=(e)=>{
        e.preventDefault();
        if(e.target.value.length<=2 && e.target.value.length !=0){
            setLnameerror(true)
        }else{
            setLnameerror(false)
        }
    }


    
    const vallEmail=(e)=>{
        e.preventDefault();
        if(e.target.value.length<=5 && e.target.value.length !=0){
            setEmailerror(true)
        }else{
            setEmailerror(false)
        }
    }

    
    const vallPassword=(e)=>{
        e.preventDefault();
        if(e.target.value.length<=8 && e.target.value.length !=0){
            setPassworderror(true)
        }else{
            setPassworderror(false)
        }
    }
        const vallCPassword=(e)=>{
        e.preventDefault();
        if(e.target.value.length<=8 && e.target.value.length !=0){
            setCPassworderror(true)
        }else{
            setCPassworderror(false)
        }
    }




    return (
        <form action="#" className="mt-2.5 bg-red-800">
            <label >First Name</label>
            <input type="text" placeholder="fname" onChange={(e)=>vallName(e)} />
            {
                fNameerror &&(
                    <p>name shode be 2 ch at lest</p>
                )
            }
            <br />
            <label >Last Name</label>
            <input type="text" placeholder="lname" onChange={(e)=>vallLName(e)} />
            {
                lNameerror &&(
                    <p>name shode be 2 ch at lest</p>
                )
            }
            <br />
            <label >Email</label>
            <input type="email" placeholder="email" onChange={(e)=>vallEmail(e)} />
            {
                Emailerror &&(
                    <p>Email shode be 5 ch at lest</p>
                )
            }
            <br />
            <label >password</label>
            <input type="password" onChange={(e)=>vallPassword(e)} />
            {
                Passworderror&&(
                    <p>password shode be 8 ch at lest</p>
                )
            }
            <br />
            <label >confirm password</label>
            <input type="passwordConfirm" onChange={(e)=>vallCPassword(e)} />
            {
                CPassworderror&&(
                    <p>confirm password shode be 8 ch at lest</p>
                )
            }
            <br />
            <button>supmit</button>
            
        </form>
    );
}

export default Register