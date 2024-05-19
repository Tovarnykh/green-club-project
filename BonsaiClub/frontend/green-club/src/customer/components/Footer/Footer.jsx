import React from 'react'
import {Button, Grid, Typography} from "@mui/material";

const Footer = () => {
    return (
        <div>

            <Grid className='bg-black text-white text-center mt-10'
                  container
                  sx={{bgcolor: "black", color: "white", py: 3}}>

                <Grid item xs={12} sm={6} md={7}>

                    <Typography className='pb-5' variant='h6'> О Компанії </Typography>
                    <div>
                        <Button className='pb-5' variant='h6' gutterBottom> Контакти </Button>
                    </div>
                    <div>
                        <Button className='pb-5' variant='h6' gutterBottom> Робочі місця </Button>
                    </div>
                    <div>
                        <Button className='pb-5' variant='h6' gutterBottom> Партнери </Button>
                    </div>

                </Grid>
                <Grid item xs={12} sm={6} md={3}>

                    <Typography className='pb-5' variant='h6'> Документація по проекту </Typography>
                    <div>
                        <Button className='pb-5' variant='h6' gutterBottom> Інструкція </Button>
                    </div>
                    <div>
                        <Button className='pb-5' variant='h6' gutterBottom> API документація </Button>
                    </div>

                </Grid>

                <Grid className='pt-20' item xs={12}>
                    <Typography varian="body2" component="p" align="center">
                        © 2024 Viktor Tovarnykh. All rights reserved.
                    </Typography>
                    <Typography variant="body2" component="p" align="center">
                        Made with love by Me.
                    </Typography>
                </Grid>

            </Grid>

        </div>
    )
}

export default Footer