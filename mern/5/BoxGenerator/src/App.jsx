import { useState } from 'react'
import './App.css'
import Color from './components/Color'

function App() {
const [col,setClo]=useState("")
const [arr,setArr]=useState([])
const setClor=(e)=>{
  setClo(e)
}
const coloor=()=>{
  setArr([...arr,"bg-"+col+"-600"])
}

  return (
    <>
    <div className='flex justify-around w-[400px] items-center '>
      <label >Color</label>
      <input type="text" onChange={(e)=>setClor(e.target.value)} className='p-[10px] border-2' />
      <button onClick={()=>coloor()} >Add</button>
    </div>
      <div className='grid grid-cols-3 gap-4  p-4'>
      {
        arr.map((item,i)=>
        
          <Color co={item} />
        
        )
      }
      </div>
      
    </>
  )
}

export default App
