import React from 'react';
import {Grid} from "@mui/material";
import AdjustIcon from '@mui/icons-material/Adjust';
import {useNavigate} from "react-router-dom";

const OrderCard = () => {

    const navigate=useNavigate();

    return (
        <div onClick={()=>navigate('/account/order/5')} className='p-5 shadow-md shadow-black hover:shadow-2x1 border'>
            <Grid container spacing={2} sx={{justifyContent: "space-between"}}>
                <Grid item xs={6}>
                    <div className='flex cursor-pointer'>
                        <img className='w-[5rem] h-[5rem] object-cover object-top'
                             src="https://plnts.com/_next/image?url=https%3A%2F%2Fwebshop.plnts.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Faa5d334f459227518b6c3cf7ea9d29ed%2Fp%2Fl%2Fpl.m.138-thumbnail.jpg&w=640&q=80"
                             alt=""/>
                        <div className='ml-5 space-y-2'>
                            <p className=''>Carnosa Tricolor</p>
                            <p className='opacity-50 text-xs font-semibold'>Size: S</p>
                        </div>
                    </div>
                </Grid>
                <Grid item xs={2}>
                    <p>₴1499</p>
                </Grid>
                <Grid item xs={4}>
                    {true && <div><p><AdjustIcon sx={{width: "15px", height: "15px"}}
                                                 className='text-green-600 mr-2 text-sm'/>
                        <span>
                            Delivered On March 03
                        </span>
                    </p>
                        <p className='text-xs'>
                            Your Item Has Been Delivered
                        </p>
                    </div>
                    }
                    {false && <p>
                        <span>
                            Expected Delivery On March 03
                        </span>
                    </p>}
                </Grid>
            </Grid>
        </div>
    );
};

export default OrderCard;