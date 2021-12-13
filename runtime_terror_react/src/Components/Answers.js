import React, { useState, useEffect } from 'react'
import AnswerListing from './AnswerListing'
import QuestionListing from './QuestionListing'

function Answers() {

    const [vastausData, setVastausData] = useState([]);
    const [Kysymykset, setKysymykset] = useState([]);

    const fetchAnswers = async () => {

        const response = await fetch("http://localhost:8080/answertests");
        const data = await response.json();

        setVastausData(data);
    }

    const fetchKysymykset = async () => {

        const response = await fetch("http://localhost:8080/questions");
        const data = await response.json();

        setKysymykset(data);
    }


    useEffect(() => {
        fetchKysymykset();
        fetchAnswers();
    }, []);
    return (
        <div>
            <div>
                {Kysymykset.map((kysymys) => {
                    return (<QuestionListing kysymysData={kysymys} />)
                })}
            </div>
            <br></br>
            <br></br>
            <div>
                {vastausData.map((vastaus) => {
                    return (<AnswerListing vastausData={vastaus} />)
                })}
            </div>
        </div>
    )
}

export default Answers