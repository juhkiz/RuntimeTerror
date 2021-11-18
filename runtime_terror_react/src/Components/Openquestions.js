import React from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';
import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';



function Openquestions(props) {

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
                <TextField id="outlined-basic" label="Avoin tekstikenttä" variant="outlined" minRows={"5"} fullWidth={true} multiline={true} />
            </Paper>
        </div>
    );
}
export default Openquestions;