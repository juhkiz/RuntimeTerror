import React from 'react';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import { Paper, Typography, Box } from '@mui/material';
import { useState } from 'react';



function FrontPage(props) {

    const [thanks, setThanks]= useState(props.thankYou);
    
    return (
        <div className="container">
        <Paper sx={{}}
        className="frontpaper"
         elevation={3}
        >
        <div>
            <h2>Tervetuloa kyselyyn</h2>
            <Button className="button" variant="contained" component={Link} to={'/question'}>Aloita kysely</Button>
        </div>
            </Paper>
            <Box className="thanks" >
            <Typography  sx={{fontWeight:"bold", fontSize:"25px"}}>{thanks}</Typography>
            </Box>
            </div>
    );
}

export default FrontPage;