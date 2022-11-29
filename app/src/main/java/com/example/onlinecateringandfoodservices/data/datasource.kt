package com.example.onlinecateringandfoodservices.data

import com.example.onlinecateringandfoodservices.R
import com.example.onlinecateringandfoodservices.model.foodItems

class DataSource {
    fun loadFooditems() : MutableList<foodItems> {
        return mutableListOf<foodItems>(
            foodItems(R.string.chicken_biryani,R.drawable.chickenbiryani,R.string.chicken_biryani_p1),
            foodItems(R.string.boneless_briyani,R.drawable.bonelessbriyani,R.string.boneless_briyani_p5),
            foodItems(R.string.mutton_biryani,R.drawable.muttonbriyani,R.string.mutton_biryani_p2),
            foodItems(R.string.veg_briyani,R.drawable.vegbriyani,R.string.veg_briyani_p3),
            foodItems(R.string.alu_rice,R.drawable.alurice,R.string.alu_rice_p9),
            foodItems(R.string.paneer_briyani,R.drawable.paneerbriyani,R.string.paneer_briyani_p4),
            foodItems(R.string.puri,R.drawable.puri,R.string.puri_p6),
            foodItems(R.string.chapati,R.drawable.chapati,R.string.chapati_p7),
            foodItems(R.string.deserts,R.drawable.deserts,R.string.deserts_p8),
        )
    }
}