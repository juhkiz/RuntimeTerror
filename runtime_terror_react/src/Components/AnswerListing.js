import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';



function AnswerListing(props) {

    console.log(props.vastausData)

    console.log(props)

    return (
        <div>
            <Paper sx={{
                minHeight:"50px",
                background: "white",
                textAlign: "left",
                maxWidth: "400px",
                margin: "auto",
                marginBottom: "20px",
            }} >
                <Typography sx={{fontWeight:"bold"}}> Vastaus ID: {props.vastausData.questionId}  <br/> Vastaus: {props.vastausData.answer}</Typography>
                <br></br>
            </Paper>
        </div>
    );
}
export default AnswerListing