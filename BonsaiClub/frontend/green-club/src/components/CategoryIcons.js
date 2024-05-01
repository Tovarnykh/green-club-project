import React from 'react';
import './CategoryIcons.css';
import {Link} from "react-router-dom";
import alocasia  from "./Alocasia.png";
import philodendron  from "./Philodendron.png";
import monstera from "./Monstera.png";
import anthurium from "./Anthurium.png";
import hoya from "./Hoya.png";
import syngonium from "./Syngonium.png";

function CategoryIcons() {
    return (
        <div className="category-icons">
            <div className="alocasia-icon">
                <Link to="/alocasia">
                    <img src={alocasia} alt="" />
                </Link>
            </div>
            <div className="philodendron-icon">
                <Link to="/philodendron">
                    <img src={philodendron} alt="" />
                </Link>
            </div>
            <div className="monstera-icon">
                <Link to="/monstera">
                    <img src={monstera} alt="" />
                </Link>
            </div>
            <div className="anthurium-icon">
                <Link to="/anthurium">
                    <img src={anthurium} alt="" />
                </Link>
            </div>
            <div className="hoya-icon">
                <Link to="/hoya">
                    <img src={hoya} alt="" />
                </Link>
            </div>
            <div className="syngonium-icon">
                <Link to="/syngonium">
                    <img src={syngonium} alt="" />
                </Link>
            </div>
        </div>
    );
}

export default CategoryIcons;