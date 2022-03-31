package com.example.androidlab7

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import com.example.androidlab7.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val contact: Contact? = intent.getParcelableExtra("contact")

        if (contact != null) {
            if (contact.fullName.isNotBlank()) {
                binding.fullNameL.visibility = VISIBLE
                binding.fullNameTextView.text = contact.fullName
            }
            if (contact.phoneNumber.isNotBlank()) {
                binding.phoneNumberL.visibility = VISIBLE
                binding.phoneNumberTextView.text = contact.phoneNumber
            }
            if (contact.emailAddress.isNotBlank()) {
                binding.emailL.visibility = VISIBLE
                binding.emailTextView.text = contact.emailAddress
            }
            if (contact.country.isNotBlank()) {
                binding.countryL.visibility = VISIBLE
                binding.countryTextView.text = contact.country
            }
            if (contact.lifeStory.isNotBlank()) {
                binding.lifeStoryL.visibility = VISIBLE
                binding.lifeStoryTextView.text = contact.lifeStory
            }
        }
    }
}