import './App.css'
import {
  Routes,
  Route,
  Link
} from "react-router-dom";
import Home from './Components/Home';
import { useParams } from "react-router";

const Word = () => {
  const {word}=useParams();
  return (
    <>
    {
      isNaN(word) ? (
      <h1>this word is : {word}</h1>
      ) : (
      <h1>this number is : {word}</h1>
      )
    }
    </>
  );
}
const WordColer = () => {
  const { word, colerA ,colerB } = useParams();

  return (
    <>
    <div style={{ width: "1400px", height: "70px", backgroundColor: colerA }}>
      {isNaN(word) ? (
        <h1 style={{ color: colerB }}>this word is: {word}</h1>
      ) : (
        <h1 style={{ color: colerB }}>this number is: {word}</h1>
      )}
    </div>
    </>
  );
};


function App() {
  return (
    <>
      <Routes>
        <Route path='/Home'element={<Home/>} />
        <Route path='/:word' element={<Word/>}/>
        <Route path='/:word/:colerB/:colerA' element={<WordColer/>}/>
      </Routes>
    </>
  )
}

export default App
