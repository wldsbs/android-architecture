package com.example.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvc.databinding.ActivityMainBinding
import com.example.mvc.model.User
import com.example.mvc.model.UserDataSource
import com.example.mvc.model.UserRepository

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var userRepository = UserRepository(UserDataSource())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()

        binding.buttonModify.setOnClickListener {
            userRepository.insertUserInfo(
                User(
                    "1",
                    binding.editName.text.toString(),
                    binding.editPhone.text.toString(),
                    binding.editEmail.text.toString()
                )
            )
            initView()
        }
    }

    private fun initView() {
        //UI setting
        val todo = userRepository.getUserInfo()

        binding.textName.text = todo.name
        binding.textPhone.text = todo.phone
        binding.textEmail.text = todo.email
    }
}