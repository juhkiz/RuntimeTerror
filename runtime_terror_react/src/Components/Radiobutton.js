
import React from 'react'
import { useState, useEffect } from 'react'

import RadioMap from './RadioMap'

// Miten mapataan ?? // 
const kysymykset = [{
    id:"1",
    kys1:"Ei ole ",
    kys2:"wasd",
    kys3:"hello",
},
{
    id:"2",
    kys1:"asd",
    kys2:"wasd",
    kys3:"hello",
},
{
    id:"3",
    kys1:"asd",
    kys2:"wasd",
    kys3:"hello",
}
]

let kysymykset1 = ["Ei ole ", "On" ,"En tiedä"]
let kysymykset2 = ["Juu", "Jaa" ,"Joo"]
let kysymykset3 = ["1", "5" ,"10"]




 function Radiobutton() {


        // React state variable to hold data, set to null // 
        const [kysymykset, setKysymykset] = useState(null);

        // we will use async/await to fetch this data // 
        const fetchKysymykset = async () => {
    
            // Api request to fetch data // 
            const response = await fetch("localhost:8080/questions");
            const data = await response.json();
    
            // store the data into our chicken variable
            setKysymykset(data);
        }
        console.log(kysymykset)
    
        // call fetchChicken on start // 
        useEffect(() => {
            fetchKysymykset();
        }, []);
    return (
        <div>
        <p>Kysymykset1</p>
        <RadioMap data = {kysymykset1} name="kysymykset1" type="radio" /> 
        <p>Kysymykset2</p>
        <RadioMap data= {kysymykset2} name="kysymykset2" type="radio" /> 
        <p>Kysymykset3</p>
        <RadioMap data = {kysymykset3} name="kysymykset3" type="radio"  /> 
        </div> 
      );
    };

    export default Radiobutton