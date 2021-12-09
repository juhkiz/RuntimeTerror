import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import { Link } from 'react-router-dom';


export default function ButtonAppBar() {
  return (
    <Box sx={{ flexGrow: 1, marginBottom: "25px" }}>
      <AppBar position="static" >
        <Toolbar sx={{ backgroundColor: "#00a2ff" }}>
          <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
            Kyselylomake
          </Typography>
          <Button color="inherit" href="http://localhost:8080/addquestions">Admin sisäänkirjaus </Button>
          <Link to="/">
            <Button color="inherit">Etusivu </Button>
          </Link>
        </Toolbar>
      </AppBar>
    </Box>
  );
}