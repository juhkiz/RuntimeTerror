import './App.css';
import FrontPage from './Components/FrontPage';
import Question from './Components/Question';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Radiobutton from './Components/Radiobutton';
import Harjotus from './Components/Harjotus';
import ButtonAppBar from './Components/ButtonAppBar';
import './Components/css.css';



function App() {
  return (
    <BrowserRouter>
     <ButtonAppBar/>
            <Switch> 
        
                <Route exact path='/'> <FrontPage /> </Route>
<<<<<<< HEAD
                <Route path='/question'> <Radiobutton /> </Route>
                <Route path='/testi'> <Harjotus /> </Route>
=======
                <Route path='/question'> <Radiobutton /></Route>
>>>>>>> 9bb9508bd7f6f8dabe5bf49e4efc185de05b7249
                </Switch>
        </BrowserRouter>
  );
}

export default App;
