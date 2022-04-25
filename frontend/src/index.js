import React from 'react';
import ReactDOM from 'react-dom/client';
import Index from './Pages/Index';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import '../src/components/filtodepesquisa/filtro.css'

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>  
   <Router>     
     <Routes>
       <Route path="/" element = {<Index/>}></Route>
     </Routes>
   </Router>
  </React.StrictMode>

);


