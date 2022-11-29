package com.example.onlinecateringandfoodservices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class orderbooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderbooking)
        val imageView: ImageView = findViewById(R.id.order_img)
        val bundle: Bundle? = intent.extras
        val resId: Int = bundle!!.getInt("resId")
        imageView.setImageResource(resId)
    }
}