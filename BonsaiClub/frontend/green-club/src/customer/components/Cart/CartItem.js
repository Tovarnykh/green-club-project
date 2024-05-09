import React from 'react';
import {Button, IconButton} from "@mui/material";
import RemoveCircleOutlineIcon from '@mui/icons-material/RemoveCircleOutline';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';

const CartItem = () => {
    return (
        <div className='p-5 shadow-lg border rounded-md'>
            <div className='flex items-center'>
                <div className='w-[5rem] h-[5rem] lg:w-[9rem] lg:h-[9rem]'>
                    <img className='w-full h-full object-cover object-top'
                         src="https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80"
                         alt=""/>
                </div>

                <div className='ml-5 space-y-1'>
                    <p className='font-semibold'>Plant</p>
                    <p className='opacity-70'>Size: S</p>
                    <p className='opacity-70 mt-2'>Seller: teeeeeext</p>
                    <div className='flex space-x-5 items-center text-gray-900 pt-6'>
                        <p className='font-semibold'>
                            ₴499
                        </p>
                        <p className='opacity-50 line-through'>
                            ₴1499
                        </p>
                        <p className='text-green-600 font-semibold'>
                            66% OFF
                        </p>
                    </div>
                </div>
            </div>
            <div className='lg:flex items-center lg:space-x-10 pt-4'>
                <div className='flex items-center space-x-2'>
                    <IconButton >
                        <RemoveCircleOutlineIcon/>
                    </IconButton>
                    <span className='py-1 px-7 border rounded-sm'>3</span>
                            <IconButton sx={{color:"RGB(145 85 253)"}}>
                            <AddCircleOutlineIcon/>
                        </IconButton>
                </div>
                <div>
                    <Button sx={{color:"RGB(145 85 253)"}}>Remove</Button>
                </div>
            </div>
        </div>
    );
};

export default CartItem;