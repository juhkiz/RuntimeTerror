import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';

function Checkbox(props) {

    var array = props.kysymys.options.split(',');

    return (
        <div>
            <Paper sx={{
                background: "white",
                textAlign: "left",
                maxWidth: "400px",
                margin: "auto",
                marginBottom: "20px",
            }}>
                <Typography>
                    <Box sx={{ fontWeight: 'bold', m: 1 }}>{props.kysymys.questionName}</Box>
                </Typography>
                {array.map(optio => <label>
                    <input type="checkbox" value={optio} id={props.kysymys.questionId} name={props.kysymys.questionId} onChange={(e) => props.handleCheckboxAdd(e)} />
                    {optio}
                    <br></br>
                </label>)}
            </Paper>
        </div>
    );
}
export default Checkbox

//{props.kysymys.options.map(optio => <input type="checkbox" value = {optio.option} name = {optio.optionId} onChange={(e) => handleChange(e.target.value)}/>)}