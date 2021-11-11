import React from 'react';
import { useState } from 'react';

import {  Paper } from '@mui/material';
import { TextField } from '@mui/material';
import { Button } from '@mui/material';
import { AppBar } from '@mui/material/AppBar';
import { Toolbar} from '@mui/material/Toolbar';
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

export default function Harjotus() {


    const styles = useStyles();
    

   const [vastaus, setVastaus] = useState("");
 
    /*const pressButton = (e) => {
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
 */
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


<Button className={styles.root}  variant='contained' sx={{ marginRight: 2, background: 'linear-gradient(to right bottom, #7465FF, #35B5FF)' }} >Lähetä</Button>
    </Paper>
        </div>
    );
}
