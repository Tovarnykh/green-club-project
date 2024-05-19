import React from 'react';
import {Grid, TextField} from "@mui/material";
import AddressCard from "../AddressCard/AddressCard";
import Button from "@mui/material/Button";
import Box from "@mui/material/Box";
import {useDispatch} from "react-redux";
import {createOrder} from "../../../state/order/Action";
import {useNavigate} from "react-router-dom";

const DeliveryAddressForm = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate()

    const handleSubmit = (e) => {
        e.preventDefault();
        const data = new FormData(e.currentTarget)
        const address = {
            firstName: data.get("firstName"),
            lastName: data.get("lastName"),
            streetAddress: data.get("address"),
            city: data.get("city"),
            state: data.get("state"),
            zipCode: data.get("postalCode"),
            mobile: data.get("phone"),
        }
        const orderData = {address, navigate}
        dispatch(createOrder(orderData))
        console.log("address:", address)
    }
    return (
        <div>
            <Grid container spacing={4}>
                <Grid xs={12} lg={5} className='border rounded-e-md shadow-md h-[30.5rem] overflow-y-scroll'>
                    <div className='py-5 py-7 border-b cursor-pointer ml-5'>
                        <AddressCard/>
                        <Button sx={{mt: 2, bgcolor: "RGB(145 85 253)"}} size='large' variant='contained'>Доставити сюди</Button>
                    </div>
                </Grid>
                <Grid item xs={12} lg={7}>
                    <Box className="border rounded-s-md shadow-md p-5">
                        <form onSubmit={handleSubmit}>
                            <Grid container spacing={3}>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="firstName" name="firstName" label="Ім'я" fullWidth
                                               autoComplete="given-name"/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="lastName" name="lastName" label="Фамілія" fullWidth
                                               autoComplete="given-second-name"/>
                                </Grid>
                                <Grid item xs={12}>
                                    <TextField required id="address" name="address" label="Адресс" fullWidth
                                               autoComplete="address" multiline rows={4}/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="city" name="city" label="Місто" fullWidth
                                               autoComplete="city"/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="state" name="state" label="Країна" fullWidth
                                               autoComplete="state"/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="postalCode" name="postalCode" label="Поштовий код" fullWidth
                                               autoComplete="shipping code"/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <TextField required id="mobile" name="phone" label="Мобільний номер" fullWidth
                                               autoComplete="phone number"/>
                                </Grid>
                                <Grid item xs={12} sm={6}>
                                    <Button sx={{py: 1.5, mt: 2, bgcolor: "RGB(145 85 253)"}} size='large'
                                            variant='contained' type="submit">Доставити сюди</Button>
                                </Grid>
                            </Grid>
                        </form>
                    </Box>
                </Grid>
            </Grid>

        </div>
    );
};
export default DeliveryAddressForm;