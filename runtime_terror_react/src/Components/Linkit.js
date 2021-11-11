import React from 'react'
import { AppBar } from '@mui/material';
import { Link } from 'react-router-dom';


export default function Linkit() {
    return (
        <div>
<AppBar position="static" >
 
  <Link to="/etusivu">Etusivu</Link>
  <Link to="/vantaa">Työpaikat</Link>
  <Link to="/keskikulutus">Keskikulutus</Link>

</AppBar>
        </div>
    )
}
