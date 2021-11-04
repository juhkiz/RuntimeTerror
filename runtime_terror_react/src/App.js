import './App.css';
import FrontPage from './Components/FrontPage';
import Question from './Components/Question';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Radiobutton from './Components/Radiobutton';
function App() {
  return (
    <BrowserRouter>
            <Switch> 
                <Route exact path='/'> <FrontPage /> </Route>
                <Route path='/question'> <Question /> </Route>
                </Switch>
        </BrowserRouter>
  );
}

export default App;
