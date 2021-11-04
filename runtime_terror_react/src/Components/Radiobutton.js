import React from 'react'

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


export default function radiobutton() {
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