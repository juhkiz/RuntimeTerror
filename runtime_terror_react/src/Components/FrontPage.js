import React from 'react';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';


function FrontPage() {
    return (
        <div>
            <h2>Tervetuloa kyselyyn</h2>
            <Button variant="contained" component={Link} to={'/question'}>Aloita kysely</Button>
        </div>

    );
}

export default FrontPage;