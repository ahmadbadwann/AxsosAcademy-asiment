import './App.css'
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
// import { useParams } from "react-router";
import Index from './Components';
import { useState } from 'react';
import { useNavigate } from "react-router-dom";
import Detales from './Components/Detales';


function App() {

    const [search,setSearch]=useState("");
    const [id,setId]=useState("");
  return (
    <>
      <Routes>
        <Route  path='/index' element={<Index />} />
        <Route  path='/' element={<Detales/>} />
      </Routes>
    </>
  )
}

export default App
