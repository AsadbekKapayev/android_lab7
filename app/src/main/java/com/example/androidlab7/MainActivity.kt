package com.example.androidlab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidlab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.submitButton.setOnClickListener { show() }
    }



    fun show() {
        val intent = Intent(this, SecondActivity::class.java)
        Log.d("MyLog", binding.fullNameEditText.text.toString())
        intent.putExtra(
            "contact", Contact(
                binding.fullNameEditText.text.toString(),
                binding.phoneNumberEditText.text.toString(),
                binding.emailEditText.text.toString(),
                binding.countryEditText.text.toString(),
                binding.lifeStoryEditText.text.toString(),
                binding.passwordEditText.text.toString(),
            )
        )
        startActivity(intent)
    }
}