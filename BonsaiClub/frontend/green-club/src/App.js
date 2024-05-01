import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import Banner from "./components/Banner";
import CategoryIcons from './components/CategoryIcons';

function App() {
    return (
        <Router>
            <Header />
            <Banner />
            <CategoryIcons />
            <Routes>
                <Route path="/" element={<Home />} />
                {/* Other routes here */}
            </Routes>
        </Router>
    );
}

export default App;