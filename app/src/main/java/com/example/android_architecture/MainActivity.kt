package com.example.android_architecture

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        textView.setOnClickListener { updateView() }
    }
    private fun updateView(){
        val model = Model()
        textView.text = model.getData()
    }
}