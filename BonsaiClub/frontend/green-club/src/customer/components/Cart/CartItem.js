import React from 'react';

const CartItem = () => {
    return (
        <div className='p-5 shadow-lg border rounded-md'>
            <div className='flex items-center'>
                <div className='w-[5rem] h-[5rem] lg:w-[9rem] lg:[9rem]'>
                    <img className='w-full h-full object-cover object-top'
                        src="https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80"
                        alt=""/>
                </div>

                <div className='ml-5 space-y-1'>
                    <p className='font-semibold'>Plant</p>
                    <p className='opacity-70'>Size: S</p>
                    <p className='opacity-70 mt-2'>Seller</p>
                </div>

                <div className='flex space-x-5 items-center text-lg lg:text-x1 text-gray-900 mt-6'>

                    <p className='font-semibold'>
                        ₴1499
                    </p>
                    <p className='opacity-50 line-through'>
                        ₴499
                    </p>
                    <p className='text-green-600 font-semibold'>
                        66% OFF
                    </p>

                </div>

            </div>
        </div>
    );
};

export default CartItem;