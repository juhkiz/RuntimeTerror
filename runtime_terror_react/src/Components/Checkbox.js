import React, { useState } from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';

function Checkbox(props) {

    const [vastaus, setVastaus] = useState([]);

    function calc(e) {
        setVastaus({
            ...vastaus,
            [e.target.name]: e.target.value
        })

        console.log(vastaus)
    }

    // Vastauksen käsittely ei vielä toimi toivotulla tavalla!
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
                <input type="checkbox" value={props.kysymys.option.option1} name={props.kysymys.type} onChange={(e) => calc(e)} /> {props.kysymys.option.option1}<br />
                <input type="checkbox" value={props.kysymys.option.option2} name={props.kysymys.type} onChange={(e) => calc(e)} /> {props.kysymys.option.option2}
            </Paper>
        </div>
    );
}
export default Checkbox