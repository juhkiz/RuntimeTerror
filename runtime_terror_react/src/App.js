import './App.css';
import FrontPage from './Components/FrontPage';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import ButtonAppBar from './Components/ButtonAppBar';
import Questions from './Components/Questions';
import Answers from './Components/Answers';
import { useState } from 'react';



function App() {



  const [thankYou, setThankYou] = useState();


  return (
    <BrowserRouter>
      <ButtonAppBar />
      <Switch>
        <Route exact path='/'> <FrontPage  thankYou = {thankYou} /> </Route>
        <Route path='/question'> <Questions setThankYou= {setThankYou}  /></Route>
        <Route path='/answers'> <Answers /> </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default App;
