import React from 'react';
import { Link } from 'react-router-dom';
import './Header.css';
import logo from './logo.png'
import cart from './cart.png'
import loop from './loop.png'
import favorite from './favorite.png'
import profile1 from './profile.png'

function Header({ onProfileClick }) {
    return (
        <header className="header">
            <Link to="/" className="logo">
                <img src={logo} alt="Plant Club" style={{ height: '50px' }} />
            </Link>
            <div className="profile-icon" onClick={onProfileClick}>
                <img src={profile1} alt="Profile" />
            </div>
            <div className="favorite-icon">
                <Link to="/favorite">
                    <img src={favorite} alt="" />
                </Link>
            </div>
            <div className="search-icon">
                <Link to="/search">
                    <img src={loop} alt="" />
                </Link>
            </div>
            <div className="cart-icon">
                <Link to="/cart">
                    <img src={cart} alt="" />
                </Link>
            </div>
        </header>
    );
}

export default Header;