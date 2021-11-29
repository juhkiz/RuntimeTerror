import React, { useState } from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';

function Checkbox(props) {

    const [checked, setChecked] = useState(false);

    const handleChange = (e) => {
        console.log(e);
    }

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
                    <Box sx={{ fontWeight: 'bold', m: 1 }}>{props.kysymys.question}</Box>
                </Typography>
                {props.kysymys.options.map(optio => <label>
                    <input type="checkbox" value={optio.option} name={optio.optionId} onChange={(e) => handleChange(e.target.value)} />
                    {optio.option}
                    <br></br>
                </label>)}
            </Paper>
        </div>
    );
}
export default Checkbox

//{props.kysymys.options.map(optio => <input type="checkbox" value = {optio.option} name = {optio.optionId} onChange={(e) => handleChange(e.target.value)}/>)}