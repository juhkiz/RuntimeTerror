import './App.css';
import FrontPage from './Components/FrontPage';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Radiobutton from './Components/Radiobutton';
import Harjotus from './Components/Harjotus';
import ButtonAppBar from './Components/ButtonAppBar';
import Checkbox from './Components/Checkbox';
import Openquestions from './Components/Openquestions';



function App() {
  return (
    <BrowserRouter>
     <ButtonAppBar/>
            <Switch> 
                <Route exact path='/'> <FrontPage /> </Route>
                <Route path='/question'> <Radiobutton /><Checkbox /><Openquestions/></Route>
                <Route path='/testi'> <Harjotus /> </Route>
                </Switch>
        </BrowserRouter>
  );
}



export default App;
