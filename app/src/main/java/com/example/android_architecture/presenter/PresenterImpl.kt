package com.example.android_architecture.presenter

import com.example.android_architecture.Model

class PresenterImpl constructor(private val view: Presenter.View) : Presenter {
    private val model: Model = Model()

    // Model에 데이터 요청 후 View에 업데이트 내용 전달
    override fun confirm() {
        view.setText(model.getData())
    }
}

