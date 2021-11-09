
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
            const response = await fetch("http://localhost:8080/questions");
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
        {/* display chickens from the API */}
        {/* Tells us what we want to map (chicken) */}
        {kysymykset&& (
            <div className="kysymykset">

                {/* Then we loop and map data stored in chicken*/}  { /* Also possible to give map function 2nd parameter like "id" and use it as key */}
                {kysymykset.map((kysymykset) => (
          
                    <div key={kysymykset.id}>
        <input type="radio" value={kysymykset.kysymys1} name={kysymykset.id}/> {kysymykset.kysymys1} 
        <input type="radio" value={kysymykset.kysymys2} name={kysymykset.id}/> {kysymykset.kysymys2} 
        <input type="radio" value={kysymykset.kysymys3} name={kysymykset.id}/> {kysymykset.kysymys3} 
 
      
                    </div>       
                ))}
            </div>
        )}
    </div>
)
}

    export default Radiobutton