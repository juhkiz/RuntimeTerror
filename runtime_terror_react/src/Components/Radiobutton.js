import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';



function Radiobutton(props) {


    return (
        <div>
            <Paper sx={{
                background: "white",
                textAlign: "left",
                maxWidth: "400px",
                margin: "auto",
                marginBottom: "20px",
            }} >
                <Typography>
                    <Box sx={{ fontWeight: 'bold', m: 1 }}>{props.kysymys.questionName}</Box>
                </Typography>
                {props.kysymys.options.map(optio => <label>
                    <input type="radio" value={optio.option} id = {props.kysymys.questionId} name={props.kysymys.questionId}  onChange={(e) => props.handleRadioAdd(e)}/>
                    {optio.option}
                    <br></br>
                </label>)}
            </Paper>
        </div>
    );
}
export default Radiobutton