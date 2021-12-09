import React from 'react'

function Answers() {
    const fetchAnswers = async () => {

        const response = await fetch("http://localhost:8080/answertests");
        const data = await response.json();

        setKysymykset(data);
    }


    useEffect(() => {
        fetchAnswers();
    }, []);

}

export default Answers