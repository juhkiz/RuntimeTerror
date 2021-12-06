import React, { useState, useEffect } from 'react';
import Radiobutton from './Radiobutton';
import Checkbox from './Checkbox';
import Openquestions from './Openquestions';
import Button from '@mui/material/Button';





function Questions() {

    const [kysymykset, setKysymykset] = useState([]);

    const [radioAnswers, setRadioAnswers] = useState([]);
    const [checkboxAnswers, setCheckboxAnswers] = useState({});
    const [openAnswers, setOpenAnswers] = useState([]);
    const [submit, setSubmit] = useState({
        radio: [],
        checkbox: [],
        open: []
    });

    const handleRadioAdd = (event) => {

        setRadioAnswers({ ...radioAnswers, [event.target.id]: event.target.value });

    }
    const handleCheckboxAdd = (event) => {

        if (checkboxAnswers[event.target.id]?.includes(event.target.value)) {
            var index = checkboxAnswers[event.target.id].indexOf(event.target.value)
            console.log(checkboxAnswers[event.target.id])
            checkboxAnswers[event.target.id].splice(index, 1)
        }
        else
            setCheckboxAnswers({ ...checkboxAnswers, [event.target.id]: [...(checkboxAnswers[event.target.id] || []), event.target.value] });
    }

    const handleOpenAdd = (event) => {
        setOpenAnswers({ ...openAnswers, [event.target.id]: event.target.value });
    }

    const handleSubmit = (radio, checkbox, open) => {
        setSubmit(
            submit.radio = radio,
            submit.checkbox = checkbox,
            submit.open = open
        )
        console.log(JSON.stringify(submit, null, 2));
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
                if (kysymys.questionType === "Radio") {
                    return (<Radiobutton kysymys={kysymys} handleRadioAdd={handleRadioAdd} />
                    );
                }
                else if (kysymys.questionType === "Checkbox") {
                    return (<Checkbox kysymys={kysymys} handleCheckboxAdd={handleCheckboxAdd} />
                    );
                }
                else if (kysymys.questionType === "Open") {
                    return (<Openquestions kysymys={kysymys} handleOpenAdd={handleOpenAdd} />
                    );
                }


            })}
            <Button sx={{ marginLeft: "45%" }} variant="contained" onClick={() => handleSubmit(radioAnswers, checkboxAnswers, openAnswers)}>Submit</Button>
        </div>
    );

}

export default Questions;
