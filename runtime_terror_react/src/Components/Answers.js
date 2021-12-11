import React, {useState, useEffect} from 'react'
import AnswerListing from './AnswerListing'

function Answers() {

    const [vastausData, setVastausData] = useState([]);

    const fetchAnswers = async () => {

        const response = await fetch("http://localhost:8080/answertests");
        const data = await response.json();

        setVastausData(data);
    }


    useEffect(() => {
        fetchAnswers();
    }, []);
    return (
        <div>
            {vastausData.map((vastaus) => {
                return(<AnswerListing vastausData = {vastaus}/>)
                })}
        </div>
    )
}

export default Answers