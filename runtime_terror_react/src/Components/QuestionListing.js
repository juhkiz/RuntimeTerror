import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';



function QuestionListing(props) {

    console.log(props.kysymysData)

    console.log(props)

    return (
        <div>
            <Paper sx={{
                minHeight:"50px",
                background: "green",
                textAlign: "left",
                maxWidth: "400px",
                margin: "auto",
                marginBottom: "20px",
            }} >
                <Typography sx={{fontWeight:"bold"}}> Kysymys ID: {props.kysymysData.questionId}  <br/> Kaysymys: {props.kysymysData.questionName}</Typography>
                <br></br>
            </Paper>
        </div>
    );
}
export default QuestionListing