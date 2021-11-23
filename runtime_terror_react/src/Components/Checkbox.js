import React, { useState } from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';

function Checkbox(props) {

    const [checked, setChecked] = useState(false);

    const handleChange = (e) => {
        setChecked(!checked);
        props.handleCheckboxAdd(e.target.value, checked)
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
                <input type="checkbox" value={props.kysymys.option.option1} name={props.kysymys.type} onChange={(e) => handleChange(e)} /> {props.kysymys.option.option1}<br />
                <input type="checkbox" value={props.kysymys.option.option2} name={props.kysymys.type} onChange={(e) => handleChange(e)} /> {props.kysymys.option.option2}
            </Paper>
        </div>
    );
}
export default Checkbox