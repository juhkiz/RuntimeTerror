import React, {useState} from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import Box from '@mui/material/Box';



function Radiobutton(props) {

    const [vastaus, setVastaus] = useState('');

    console.log(vastaus);


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
                    <Box sx={{ fontWeight: 'bold', m: 1 }}>{props.kysymys.question}</Box>
                </Typography>
                <input type="radio" value={props.kysymys.option.option1} name={props.kysymys.id} onChange={(e)=>setVastaus(e.target.value)} /> {props.kysymys.option.option1}<br />
                <input type="radio" value={props.kysymys.option.option2} name={props.kysymys.id} onChange={(e)=>setVastaus(e.target.value)} /> {props.kysymys.option.option2}
            </Paper>
        </div>
    );
}
export default Radiobutton