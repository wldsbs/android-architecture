package com.example.android_architecture

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.android_architecture.presenter.Presenter
import com.example.android_architecture.presenter.PresenterImpl

class MainActivity : AppCompatActivity(), Presenter.View {
    private lateinit var presenter: Presenter
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PresenterImpl(this@MainActivity)

        textView = findViewById(R.id.text_view)
        textView.setOnClickListener { presenter.confirm() } //Presenter로 이벤트 전달
    }

    // Presenter로 부터 전달받은 내용으로 View 업데이트
    override fun setText(text: String) {
        textView.text = text
    }
}