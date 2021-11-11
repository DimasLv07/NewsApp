package com.example.newsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val content: String,
    val title: String,
    val date: String,
    val author: String,
    val time: String,
    val photo: Int,
    val category: String
) : Parcelable
