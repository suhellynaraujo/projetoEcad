import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Index from './Pages/Index';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';

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


