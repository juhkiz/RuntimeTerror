import React from 'react';
import { useState, useEffect } from 'react';
import Typography from '@mui/material/Typography';
import { Button } from '@mui/material';
import {  Paper } from '@mui/material';
import TextField from '@mui/material/TextField';

import { makeStyles } from '@mui/styles';

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

function Openquestions() {

    const styles = useStyles();
    // React state variable to hold data, set to null // 
    const [openKysymykset, setKysymykset] = useState(null);

    // we will use async/await to fetch this data // 
    const fetchKysymykset = async () => {

        // Api request to fetch data // 
        const response = await fetch("http://localhost:8080/openquestions");
        const data = await response.json();

        // store the data into our chicken variable
        setKysymykset(data);
    }
    console.log(openKysymykset)

    // call fetchChicken on start // 
    useEffect(() => {
        fetchKysymykset();
    }, []);
    return (
        <div>
            {/* display chickens from the API */}
            {/* Tells us what we want to map (chicken) */}
            {openKysymykset && (
                <div className="kysymykset">

                    {/* Then we loop and map data stored in chicken*/}  { /* Also possible to give map function 2nd parameter like "id" and use it as key */}
                    {openKysymykset.map((openKysymykset) => (
                        <div>
                            <Paper sx={{ background: "white"}}
                                className="paper"
                                elevation={3}
                                key={openKysymykset.id}
                            >
                                <Typography variant="h6" gutterBottom component="div">
                                    {openKysymykset.kysymys}
                                </Typography>
                                <TextField id="outlined-basic" label="Avoin tekstikenttä" variant="outlined" minRows={"5"} fullWidth={true} multiline = {true}/>
                            </Paper>
                            </div>
                    ))}
                </div>
            )}
        </div>   
    );
}
export default Openquestions;