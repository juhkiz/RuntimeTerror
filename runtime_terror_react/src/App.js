import './App.css';
import FrontPage from './Components/FrontPage';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Harjotus from './Components/Harjotus';
import ButtonAppBar from './Components/ButtonAppBar';
import Questions from './Components/Questions'




function App() {
  return (
    <BrowserRouter>
     <ButtonAppBar/>
            <Switch> 
                <Route exact path='/'> <FrontPage /> </Route>
                <Route path='/question'> <Questions/></Route>
                <Route path='/testi'> <Harjotus /> </Route>
                </Switch>
        </BrowserRouter>
  );
}

export default App;
