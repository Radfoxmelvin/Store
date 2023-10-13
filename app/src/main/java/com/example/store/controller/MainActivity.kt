package com.example.store.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.store.Model.Category
import com.example.store.Services.DataService
import com.example.store.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<Category>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,DataService.category)
        binding.categoryListView.adapter=adapter
    }
}