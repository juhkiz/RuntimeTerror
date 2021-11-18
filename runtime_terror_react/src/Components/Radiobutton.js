
import React from 'react';
import { useState, useEffect } from 'react';
import Typography from '@mui/material/Typography';
import { Button } from '@mui/material';
import { Paper } from '@mui/material';

import { makeStyles } from '@mui/styles';
import { margin, textAlign } from '@mui/system';

const useStyles = makeStyles({
    root: {
        background: 'linear-gradient(45deg, #7465FF 30%, #35B5FF 90%)',
        border: 0,
        borderRadius: 3,
        boxShadow: '0 3px 5px 2px rgba(255, 105, 135, .3)',
        color: 'white',
        height: 48,
        padding: '0 30px',
    },
});

function Radiobutton(props) {

    const styles = useStyles();

    return (
        <div>
            {/* display chickens from the API */}
            {/* Tells us what we want to map (chicken) */}
            <div className="kysymykset">

                <Paper sx={{
                    background: "white",
                    textAlign: "center",
                    maxWidth: "500px",
                    margin: "auto",
                    marginBottom: "20px",
                }}
                    elevation={3}
                    key={radiobuttonKysymykset.id}
                >
                    <Typography variant="h6" gutterBottom component="div">
                        {props.kysymys}
                    </Typography>
                    <input type="radio" value={props.v1} name={props.v1} /> {props.v1}
                    <hr style={{ width: "100%" }} />
                    <input type="radio" value={props.v2} name={props.v2} /> {props.v2}
                </Paper>
            </div>
            }
        </div>
    )
} 
    );
}
export default Radiobutton