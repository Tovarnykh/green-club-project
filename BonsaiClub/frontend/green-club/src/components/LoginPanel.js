import React, { useState } from 'react';
import './LoginPanel.css'; // Ensure the CSS is properly set up

function LoginPanel({ isVisible, onClose }) {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleLogin = async (event) => {
        event.preventDefault();
        // Add your API call logic here
        console.log('Login attempt with:', email, password);
        // Dummy response logic for demonstration
        if (email === 'mail' && password === 'password') {
            console.log('Login successful');
            onClose(); // Close the panel on successful login
        } else {
            console.error('Login failed');
        }
    };

    return (
        <div className={`login-panel-container ${isVisible ? 'active' : ''}`} onClick={onClose}>
            <div className="login-panel" onClick={e => e.stopPropagation()}>
                <div className="login-content">
                    <button onClick={onClose} className="close-btn">X</button>
                    <h2>Login</h2>
                    <form onSubmit={handleLogin}>
                        <div className="form-group">
                            <label>Email:</label>
                            <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} required />
                        </div>
                        <div className="form-group">
                            <label>Password:</label>
                            <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} required />
                        </div>
                        <button type="submit" className="login-btn">Login</button>
                    </form>
                </div>
            </div>
        </div>
    );
}

export default LoginPanel;
