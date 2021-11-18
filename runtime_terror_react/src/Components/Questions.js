import React from 'react';
import Question from './Question';
import Checkbox from './Checkbox';
import Openquestions from './Openquestions';




function Questions() {
    const question = [
        { type: "Radio", question: "Miten menee", v1: "hyvin", v2: "huonosti" },
        { type: "Checkbox", question: "Miten meneeCB", v1: "hyvin", v2: "huonosti" },
        { type: "Open", question: "Miten meneeOPE" },
        { type: "Open", question: "Miten meneeOPEN2" },
        { type: "Radio", question: "Miten meneeradio", v1: "hyvin", v2: "huonosti" },
        { type: "Checkbox", question: "Miten meneecb2", v1: "hyvin", v2: "huonosti" }
    ];

    return (
        <div>
            {question.map((kysymys) => {
                if (kysymys.type === "Radio") {
                    return (<Question kysymys = {kysymys}/>
                    );
                }
                else if (kysymys.type === "Checkbox") {
                    return (<Checkbox kysymys = {kysymys}/>
                    );
                }
                else if (kysymys.type === "Open") {
                    return (<Openquestions kysymys = {kysymys}/>
                    );
                }


            })}</div>
    );

}
export default Questions