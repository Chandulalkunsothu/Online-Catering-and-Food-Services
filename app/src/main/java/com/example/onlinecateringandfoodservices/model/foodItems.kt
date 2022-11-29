package com.example.onlinecateringandfoodservices.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class foodItems(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val PriceResourceId: Int,

    )