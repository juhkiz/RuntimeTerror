import React from 'react';
import { useState, useEffect } from 'react';
import Typography from '@mui/material/Typography';
import { Paper } from '@mui/material';

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

function Checkbox() {

    const styles = useStyles();
    // React state variable to hold data, set to null // 
    const [checkboxKysymykset, setKysymykset] = useState(null);

    // we will use async/await to fetch this data // 
    const fetchKysymykset = async () => {

        // Api request to fetch data // 
        const response = await fetch("http://localhost:8080/checkboxquestions");
        const data = await response.json();

        // store the data into our chicken variable
        setKysymykset(data);
    }
    console.log(checkboxKysymykset)

    // call fetchChicken on start // 
    useEffect(() => {
        fetchKysymykset();
    }, []);
    return (
        <div>
            {/* display chickens from the API */}
            {/* Tells us what we want to map (chicken) */}
            {checkboxKysymykset && (
                <div className="checkbox">

                    {/* Then we loop and map data stored in chicken*/}  { /* Also possible to give map function 2nd parameter like "id" and use it as key */}
                    {checkboxKysymykset.map((checkboxKysymykset) => (
                        <div>
                            <Paper sx={{
                                background: "white",
                                textAlign: "center",
                                maxWidth: "500px",
                                margin: "auto",
                                marginBottom: "20px",
                            }}
                                className="paper"
                                elevation={3}
                                key={checkboxKysymykset.id}
                            >
                                <Typography variant="h6" gutterBottom component="div">
                                    {checkboxKysymykset.kysymys}
                                </Typography>
                                <input type="checkbox" value={checkboxKysymykset.vaihtoehto1} name={checkboxKysymykset.id} /> {checkboxKysymykset.vaihtoehto1}
                                <hr style={{ width: "100%" }} />
                                <input type="checkbox" value={checkboxKysymykset.vaihtoehto2} name={checkboxKysymykset.id} /> {checkboxKysymykset.vaihtoehto2}
                                <hr style={{ width: "100%" }} />
                                <input type="checkbox" value={checkboxKysymykset.vaihtoehto3} name={checkboxKysymykset.id} /> {checkboxKysymykset.vaihtoehto3}
                                <hr style={{ width: "100%" }} />
                                <input type="checkbox" value={checkboxKysymykset.vaihtoehto4} name={checkboxKysymykset.id} /> {checkboxKysymykset.vaihtoehto4}
                                <hr style={{ width: "100%" }} />
                                <input type="checkbox" value={checkboxKysymykset.vaihtoehto5} name={checkboxKysymykset.id} /> {checkboxKysymykset.vaihtoehto5}
                            </Paper>
                        </div>
                    ))}
                </div>
            )}
        </div>
    );
}
export default Checkbox