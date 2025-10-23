import { useState } from 'react'
import './App.css'
import FarenChild from './FarenChild'
import CelChild from './CelChild'


function App() {

  return (
    <>
    <h1>Tempature Convertor</h1>
    <div
    style={{ display: "flex", gap: "200px", justifyContent: "center" }}>
    <FarenChild></FarenChild>
    <CelChild></CelChild>
    </div>
    </>
  )
}

export default App
