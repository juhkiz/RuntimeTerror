import React, {useState, useEffect} from 'react';
import Radiobutton from './Radiobutton';
import Checkbox from './Checkbox';
import Openquestions from './Openquestions';
import Button from '@mui/material/Button';




function Questions() {

    const [kysymykset, setKysymykset] = useState([]);

    const questions = [
        { type: "Radio", question: "Sukupuoli", v1: "Mies", v2: "Nainen"},
        { type: "Checkbox", question: "Valitse kaksi", v1: "kaksi", v2: "kolme" },
        { type: "Open", question: "Avoin palaute" },
        { type: "Open", question: "Kerro tarina" },
        { type: "Radio", question: "Fiilis?", v1: "Hyvä", v2: "Huono" },
        { type: "Checkbox", question: "Monivalinta", v1: "hieno", v2: "ihan ok" }
    ];

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
                    return (<Radiobutton kysymys = {kysymys}/>
                    );
                }
                else if (kysymys.questionType.questionType === "Checkbox") {
                    return (<Checkbox kysymys = {kysymys}/>
                    );
                }
                else if (kysymys.questionType.questionType === "Open") {
                    return (<Openquestions kysymys = {kysymys}/>
                    );
                }


            })}
            <Button sx = {{marginLeft: "45%"}} variant="contained">Submit</Button>
            </div>
    );

}
export default Questions