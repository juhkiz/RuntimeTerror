import React from 'react';
import { useState } from 'react';

import {  Paper } from '@mui/material';
import { TextField } from '@mui/material';
import { Button } from '@mui/material';
import { AppBar } from '@mui/material/AppBar';
import { Toolbar} from '@mui/material/Toolbar';

export default function Harjotus() {


    // NUMERO ARVOT // 
    const re = /[0-9]/;

   const [arvot, setArvot] = useState({
       eka:"",
       toka:"",
   });

   const [vastaus, setVastaus] = useState("");
   const [error1, setError1] = useState("");
   const [error2, setError2] = useState("");

   const pressButton = (e) => {
       e.preventDefault();    
       setVastaus("");
       setArvot({
          eka:"",
        toka:"",
       })};

   const muuta = (e) => {
    setArvot({
      ...arvot,
      [e.target.name]: e.target.value,
    });
    setVastaus("")
};

   return (
    
        <div>
<Paper sx={{background:"white"}}
className="paper"
 elevation={3}
>
    <div className="questions">
        <h4>
            Tykkäätkö käydä kakaklla??
        </h4>
        <hr style={{width:"100%"}}/>
        
    </div>
    {/*}
<TextField id="standard-basic" label="Blaablaa" variant="standard" required fullWidth name="tankki" value={arvot.eka}
onChange={(e) => muuta(e)}/>
   */}


<Button onClick={(e) => pressButton(e)} variant='contained' sx={{ marginRight: 2, }} >Lähetä</Button>

    </Paper>


        </div>
    );
}
