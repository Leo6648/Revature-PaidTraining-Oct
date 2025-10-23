import { useState } from "react";

function CelChild(){
    const [Faren, setFaren] = useState(0);
    const [Cel, setCel] = useState(0);
    function handleChange(event) {
        setCel(event.target.value);
    }

    function handleConvert(){
        const f = ((Faren + 32) * 9) / 5;
        setFaren(f.toFixed(2));
    }
    return(
        <>
        <div>
            <h1>Celsius</h1>
            <p>Enter Celsius Degree</p>
            <input
            type="number"
            value={Cel}
            onChange={handleChange}
            />
            <p>Result</p>
            <input
            type="number"
            value={Faren}
            readOnly
            />
            <br></br>
            <button onClick={handleConvert}>Convert Celsius</button>
        </div>
        </>
        
    );
}

export default CelChild