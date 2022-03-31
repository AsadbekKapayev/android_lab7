package com.example.androidlab7

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val fullName: String,
    val phoneNumber: String,
    val emailAddress: String,
    val country: String,
    val lifeStory: String,
    val password: String
) : Parcelable