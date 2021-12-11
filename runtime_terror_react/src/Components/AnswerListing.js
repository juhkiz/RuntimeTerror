import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';



function AnswerListing(props) {

    console.log(props.vastausData)

    return (
        <div>
            <Paper sx={{
                background: "white",
                textAlign: "left",
                maxWidth: "400px",
                margin: "auto",
                marginBottom: "20px",
            }} >
                <Typography> Vastaus ID: {props.vastausData.questionId} Vastaus: {props.vastausData.answer}</Typography>
                <br></br>
            </Paper>
        </div>
    );
}
export default AnswerListing