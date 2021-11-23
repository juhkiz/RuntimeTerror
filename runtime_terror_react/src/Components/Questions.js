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

    const handleRadioAdd = (vastaus) => {

        setRadioAnswers(vastaus);
        console.log(vastaus);
        console.log(radioAnswers);
    }
    const handleCheckboxAdd = (vastaus, checked) => {
        if (checked) {
            setCheckboxAnswers(checkboxAnswers => [vastaus, ...checkboxAnswers])
        }
        if (!checked) {
            setCheckboxAnswers([]);
        }
        console.log(checkboxAnswers);
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
                    return (<Openquestions kysymys={kysymys} />
                    );
                }


            })}
            <Button sx={{ marginLeft: "45%" }} variant="contained">Submit</Button>
        </div>
    );

}
export default Questions