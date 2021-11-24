import React, { useState, useEffect } from 'react';
import Radiobutton from './Radiobutton';
import Checkbox from './Checkbox';
import Openquestions from './Openquestions';
import Button from '@mui/material/Button';




function Questions() {

    const [kysymykset, setKysymykset] = useState([]);

    const [radioAnswers, setRadioAnswers] = useState([]);
    const [checkboxAnswers, setCheckboxAnswers] = useState([]);
    const [openAnswers, setOpenAnswers] = useState([]);
    const [submit, setSubmit] = useState({
        radio: [],
        checkbox: [],
        open: []
    });

    const handleRadioAdd = (vastaus) => {
        
        setRadioAnswers(radioAnswers => [...radioAnswers, vastaus]);
        console.log(vastaus);
    }
    const handleCheckboxAdd = (vastaus) => {
        if (checkboxAnswers.includes(vastaus))
        {
            var i = checkboxAnswers.indexOf(vastaus)
            checkboxAnswers.splice(i,1);
        }
        else
            setCheckboxAnswers(checkboxAnswers => [...checkboxAnswers, vastaus])
    }

    const handleOpenAdd = (vastaus) => {
        setOpenAnswers(openAnswers => [...openAnswers, vastaus]);
    }

    const handleSubmit = (radio, checkbox, open) => {
        setSubmit(
            submit.radio = radio,
            submit.checkbox = checkbox,
            submit.open = open
        )
        console.log(submit);
    }

    const fetchKysymykset = async () => {

        const response = await fetch("http://localhost:8080/questions");
        const data = await response.json();

        setKysymykset(data);
    }


    useEffect(() => {
        fetchKysymykset();
    }, []);


    return (

        <div>
            {kysymykset.map((kysymys) => {
                if (kysymys.questionType.questionType === "Radio") {
                    return (<Radiobutton kysymys={kysymys} handleRadioAdd={handleRadioAdd} />
                    );
                }
                else if (kysymys.questionType.questionType === "Checkbox") {
                    return (<Checkbox kysymys={kysymys} handleCheckboxAdd={handleCheckboxAdd} />
                    );
                }
                else if (kysymys.questionType.questionType === "Open") {
                    return (<Openquestions kysymys={kysymys} handleOpenAdd={handleOpenAdd} />
                    );
                }


            })}
            <Button sx={{ marginLeft: "45%" }} variant="contained" onClick = {()=> handleSubmit(radioAnswers, checkboxAnswers, openAnswers)}>Submit</Button>
        </div>
    );

}
export default Questions