import React from 'react';


function Question() {

    let kysymys = ['Question 1', 'Question 2', 'Question 3'];
    return (
        <div>
            {kysymys.map(result => (
                <div>
                    <input type="radio" value={result} name="radiovalues" />
                    <b>{result}</b>
                </div>
            ))}
        </div>
    );
}

export default Question;