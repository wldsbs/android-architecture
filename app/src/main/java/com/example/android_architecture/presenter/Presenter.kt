package com.example.android_architecture.presenter

interface Presenter {
    fun confirm()
    interface View {
        fun setText(text: String)
    }
}

