import React from 'react';
import './CategoryIcons.css';
import { Link } from "react-router-dom";
import alocasia from "./Alocasia.png";
import philodendron from "./Philodendron.png";
import monstera from "./Monstera.png";
import anthurium from "./Anthurium.png";
import hoya from "./Hoya.png";
import syngonium from "./Syngonium.png";

function CategoryIcons() {
    return (
        <div className="category-icons">
            <div className="category-icon">
                <Link to="/alocasia">
                    <img src={alocasia} alt="Alocasia" />
                    <span>Alocasia</span>
                </Link>
            </div>
            <div className="category-icon">
                <Link to="/philodendron">
                    <img src={philodendron} alt="Philodendron" />
                    <span>Philodendron</span>
                </Link>
            </div>
            <div className="category-icon">
                <Link to="/monstera">
                    <img src={monstera} alt="Monstera" />
                    <span>Monstera</span>
                </Link>
            </div>
            <div className="category-icon">
                <Link to="/anthurium">
                    <img src={anthurium} alt="Anthurium" />
                    <span>Anthurium</span>
                </Link>
            </div>
            <div className="category-icon">
                <Link to="/hoya">
                    <img src={hoya} alt="Hoya" />
                    <span>Hoya</span>
                </Link>
            </div>
            <div className="category-icon">
                <Link to="/syngonium">
                    <img src={syngonium} alt="Syngonium" />
                    <span>Syngonium</span>
                </Link>
            </div>
        </div>
    );
}

export default CategoryIcons;
