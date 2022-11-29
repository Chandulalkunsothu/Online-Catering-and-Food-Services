package com.example.onlinecateringandfoodservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinecateringandfoodservices.adaptor.ItemAdapter
import com.example.onlinecateringandfoodservices.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        setContentView(R.layout.list_item)
*/

        val myDataset = DataSource().loadFooditems()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
        val index=0
        val parseImg=myDataset[index].imageResourceId

    }

}


