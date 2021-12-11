import './App.css';
import FrontPage from './Components/FrontPage';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import ButtonAppBar from './Components/ButtonAppBar';
import Questions from './Components/Questions';
import Answers from './Components/Answers';




function App() {
  return (
    <BrowserRouter>
      <ButtonAppBar />
      <Switch>
        <Route exact path='/'> <FrontPage /> </Route>
        <Route path='/question'> <Questions /></Route>
        <Route path='/answers'> <Answers /> </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default App;
