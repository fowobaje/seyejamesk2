package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("Chromebook", "This is products description", R.drawable.ic_laptop_chromebook))
        arrayList.add(Model("Mouse", "This is products description", R.drawable.ic_mouse_black_24dp))
        arrayList.add(Model("iPhone", "This is products description", R.drawable.ic_phone_iphone))
        arrayList.add(Model("Tablet", "This is products description", R.drawable.ic_tablet_android))
        arrayList.add(Model("Television", "This is products description", R.drawable.ic_tv_black))
        arrayList.add(Model("Chromebook", "This is products description", R.drawable.ic_laptop_chromebook))
        arrayList.add(Model("Mouse", "This is products description", R.drawable.ic_mouse_black_24dp))
        arrayList.add(Model("iPhone", "This is products description", R.drawable.ic_phone_iphone))
        arrayList.add(Model("Tablet", "This is products description", R.drawable.ic_tablet_android))
        arrayList.add(Model("Television", "This is products description", R.drawable.ic_tv_black))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}
