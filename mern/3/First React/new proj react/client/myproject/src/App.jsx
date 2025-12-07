import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Parson from './Components/firstComponents'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Parson firstname="chrestin" lastname="pshara" age="50" hearcoler="brown" />
      <Parson firstname="badwan" lastname="ahmad" age ="21" hearcoler="brown"/>
      <Parson firstname="khaled" lastname="aldeck" age ="25" hearcoler="brown"/>
      <Parson firstname="khalel" lastname="ibrahem" age ="31" hearcoler="null"/>
    </>
  )
}

export default App
