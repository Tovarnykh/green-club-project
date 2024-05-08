import React from 'react';
import Navigation from './customer/components/Navigation/Navigation';
import Footer from "./customer/components/Footer/Footer";
import Product from "./customer/components/Product/Product";
import HomePage from "./customer/components/pages/HomePage/HomePage";

function App() {

    return (
            <div className="">
                <Navigation/>
                <div>
                    {/*<HomePage/>*/}
                    <Product/>
                </div>
                <Footer/>
            </div>
    );
}

export default App;
