import React from 'react';
import AddressCard from "../AddressCard/AddressCard";
import OrderTracker from "./OrderTracker";
import {Grid} from "@mui/material";
import Box from "@mui/material/Box";
import {deepPurple} from "@mui/material/colors";
import StarBorderIcon from '@mui/icons-material/StarBorder';

const OrderDetails = () => {
    return (
        <div className='px:5 lg:px-20'>
            <div>
                <h1 className='font-bold text-xl py-7'>Delivery Address</h1>
                <AddressCard/>
            </div>
            <div className='py-20'>
                <OrderTracker activeStep={3}/>
            </div>
            <Grid className='space-y-5' container>
                {[1,1,1,1,1].map((item)=><Grid item container className='shadow-xl rounded-md p-5 border'
                                               sx={{alignItems: "center", justifyContent: 'space-between'}}>
                    <Grid item xs={6}>
                        <div className='flex items-center space-x-4'>
                            <img className="w-[5rem] h-[5rem] object-cover object-top"
                                 src="https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80"
                                 alt=""
                            />
                            <div className='space-y-2 ml-5'>
                                <p className='font-semibold'>Carnosa Tricolor</p>
                                <p className='space-x-5 opacity-50 text-xs font-semibold'><span>Size: M</span></p>
                                <p>Family: Hoya</p>
                                <p>₴1499</p>
                            </div>
                        </div>
                    </Grid>
                    <Grid item>
                        <Box sx={{color:deepPurple[500]}}>
                            <StarBorderIcon sx={{fontSize:"2rem"}}className='px-2' />
                            <span>Rate & Review Product</span>
                        </Box>
                    </Grid>
                </Grid>)}

            </Grid>
        </div>
    );
};

export default OrderDetails;