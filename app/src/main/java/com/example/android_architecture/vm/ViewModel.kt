package com.example.android_architecture.vm

import androidx.lifecycle.MutableLiveData
import com.example.android_architecture.Model


class ViewModel {
    private val model: Model = Model()
    var _text = MutableLiveData<String>()

    fun updateText() {
        _text.value = model.getData()
    }
}



