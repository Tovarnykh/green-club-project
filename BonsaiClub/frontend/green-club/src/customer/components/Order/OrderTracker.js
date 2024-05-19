import React from 'react';
import Stepper from "@mui/material/Stepper";
import Step from "@mui/material/Step";
import {StepLabel} from "@mui/material";

const OrderTracker = ({activeStep}) => {

    const steps=[
        "Placed",
        "Order Confirmed",
        "Shipped",
        "Out For Delivery",
        "Delivered"
    ]

    return (
        <div className='w-full'>
            <Stepper activeStep={activeStep} alternativeLabel>
                {steps.map((label)=> <Step>
                    <StepLabel sx={{color:"#9155FD", fontSize:"44px"}}>{
                        label
                    }</StepLabel>
                </Step>)}
            </Stepper>
        </div>
    );
};

export default OrderTracker;