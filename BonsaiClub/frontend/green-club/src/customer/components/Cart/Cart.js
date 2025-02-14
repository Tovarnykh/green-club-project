import React, {useEffect} from 'react';
import CartItem from "./CartItem";
import {Button} from "@mui/material";
import {useNavigate} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import {getCart} from "../../../state/cart/Action";

const Cart = () => {
    const navigate=useNavigate();
    const {cart} = useSelector(store=>store)
    const dispatch = useDispatch();
    const handleCheckout=()=>{
        navigate("/checkout?step=2")
    }

    useEffect(()=>{
        dispatch(getCart())
    },[cart.updateCartItem, cart.deleteCartItem])

    return (
        <div className='mt-10'>
            <div className='lg:grid grid-cols-3 lg:px-16 relative'>
                <div className='col-span-2'>
                    {cart.cart?.cartItems.map((item)=><CartItem item={item}/>)}
                </div>
                <div className='px-5 sticky top-0 h-[100vh] mt-5 lg:mt-0'>
                    <div className='border'>
                        <p className='uppercase font-bold opacity-60 pb-4'>Чек</p>
                        <hr/>
                        <div className='space-y-3 font-semibold mb-10'>
                            <div className='flex justify-between pt-3 text-black'>
                                <span>Ціна</span>
                                <span>₴{cart.cart?.totalPrice}</span>
                            </div>
                        <div className='flex justify-between pt-3'>
                            <span>Скидка</span>
                            <span className='text-green-600'>-{cart.cart?.discount}</span>
                        </div>
                        <div className='flex justify-between pt-3'>
                            <span>Ціна доставки</span>
                            <span className='text-green-600'>Безкоштовно</span>
                        </div>
                        <div className='flex justify-between pt-3 font-bold'>
                            <span>Повна ціна</span>
                            <span className='text-green-600'>₴{cart.cart?.totalDiscountedPrice}</span>
                        </div>
                        </div>
                        <Button onClick={handleCheckout} variant="contained" className='w-full mt-5' sx={{px: "2.5rem", py: ".7rem", bgcolor: "#9155fd"}}>
                            Підтвердити
                        </Button>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Cart;