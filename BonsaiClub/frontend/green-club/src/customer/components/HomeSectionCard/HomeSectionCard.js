import React from 'react';

const HomeSectionCard = () => {
    return(
    <div className='cursor-pointer flex flex-col items-center bg-white rounded-lg shadow-lg overflow-hidden w-[15rem] mx-3'>
        <div className='h-[13rem] w-[10rem]'>
            <img className='object-cover object-top w-full h-full' src="https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80" alt=""/>
        </div>

        <div className='p-4'>
            <h3 className='text-lg font-medium text-gray-900'>Plant Family</h3>
            <p className='mt-2 text-sm text-gray-500'>Full plant name</p>
        </div>

    </div>
    )};

export default HomeSectionCard;