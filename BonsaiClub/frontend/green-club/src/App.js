import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';
import Banner from "./components/Banner";
import CategoryIcons from './components/CategoryIcons';
import LoginPanel from './components/LoginPanel';  // Assuming LoginPanel is correctly implemented

function App() {
    const [isPanelVisible, setIsPanelVisible] = useState(false);

    const togglePanel = () => setIsPanelVisible(!isPanelVisible);

    return (
        <Router>
            <div>
                <Header onProfileClick={togglePanel}  />
                <Banner />
                <CategoryIcons />
                <LoginPanel isVisible={isPanelVisible} onClose={() => setIsPanelVisible(false)} />
                <Routes>
                    <Route path="/" element={<Home />} />
                    {/* Other routes here */}
                </Routes>
            </div>
        </Router>
    );
}

export default App;
