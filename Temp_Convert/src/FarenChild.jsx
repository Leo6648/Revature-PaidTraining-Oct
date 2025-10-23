import { useState } from "react";
function FarenChild(){
    const [Faren, setFaren] = useState(0);
    const [Cel, setCel] = useState(0);
    function handleChange(event) {
        setFaren(event.target.value);
    }

    function handleConvert(){
        const c = ((Faren - 32) * 5) / 9;
        setCel(c.toFixed(2));
    }
    return(
        <>
        <div>
            <h1>Fahrenheit</h1>
            <p>Enter Farenheit Degree</p>
            <input
            type="number"
            value={Faren}
            onChange={handleChange}
            />
            <p>Result</p>
            <input
            type="number"
            value = {Cel}
            readOnly
            />
            <br></br>
            <button onClick={handleConvert}>Convert Farenheit</button>
        </div>
        </>
    );
}

export default FarenChild