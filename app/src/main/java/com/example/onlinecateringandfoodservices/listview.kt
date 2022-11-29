package com.example.onlinecateringandfoodservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinecateringandfoodservices.adaptor.ItemAdapter
import com.example.onlinecateringandfoodservices.data.DataSource

class listview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        val myDataset = DataSource().loadFooditems()
/*
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
*/
      /*  recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)*/

        val index=6
        val parseImg=myDataset[index].imageResourceId
        val btnSend: Button = findViewById(R.id.Addbtn)
        fun send(){
        btnSend.setOnClickListener {

            val intent = Intent(this@listview, orderbooking::class.java)
            intent.putExtra("resId", parseImg)
            startActivity(intent)
        }
        }
    }
}