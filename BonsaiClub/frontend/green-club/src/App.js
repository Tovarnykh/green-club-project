import React from 'react';
import Navigation from './customer/components/Navigation/Navigation';
import Footer from "./customer/components/Footer/Footer";
import Product from "./customer/components/Product/Product";
import HomePage from "./customer/components/pages/HomePage/HomePage";
import ProductDetails from "./customer/components/ProductDetails/ProductDetails";
import Cart from "./customer/components/Cart/Cart";
import Checkout from "./customer/components/Checkout/Checkout";

function App() {

    return (
            <div className="">
                <Navigation/>
                <div>
                    {/*<HomePage/>*/}
                    {/*<Product/>*/}
                    {/*<ProductDetails/>*/}
                    {/*<Cart/>*/}
                    <Checkout/>
                </div>
                <Footer/>
            </div>
    );
}

export default App;
