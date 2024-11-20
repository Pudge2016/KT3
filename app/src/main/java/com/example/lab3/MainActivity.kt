package com.example.lab3

import RecyclerAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.DataItem


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testData = listOf(
            DataItem("Item 1", "Description for Item 1"),
            DataItem("Item 2", "Description for Item 2"),
            DataItem("Item 3", "Description for Item 3"),
            DataItem("Item 4", "Description for Item 4")

        )

        // Отримання доступу до RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Налаштування LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Пізніше під'єднаємо адаптер
        val adapter = RecyclerAdapter(testData)
        recyclerView.adapter = adapter

    }


}