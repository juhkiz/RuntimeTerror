import React from 'react';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import { Paper } from '@mui/material';


function FrontPage() {
    return (
        <div className="container">
        
        <Paper sx={{}}
        className="frontpaper"
         elevation={3}
        >
        <div>
            <h2>Tervetuloa kyselyyn</h2>
            <Button variant="contained" component={Link} to={'/question'}>Aloita kysely</Button>
        </div>
            </Paper>
            </div>
    );
}

export default FrontPage;