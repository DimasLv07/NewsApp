package com.example.newsapp


import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.data.DataNews
import com.example.newsapp.AllNewsFragment
import android.view.LayoutInflater
import android.view.View



fun dimas(context: Context ,view: View,number : Int) {

    val imgNewsHeadline : ImageView = view.findViewById(R.id.img_news)
    val tvTitleHeadline : TextView = view.findViewById(R.id.tv_title_headline)
    val tvDescHeadline : TextView = view.findViewById(R.id.tv_desc_headline)
    val tvDateHeadline : TextView = view.findViewById(R.id.tv_date_headline)
    val tvAuthorHeadline: TextView = view.findViewById(R.id.tv_author_headline)

    imgNewsHeadline.setImageResource(DataNews.photoHeadline[number])
    tvTitleHeadline.text = DataNews.titleHeadline[number]
    tvDescHeadline.text = DataNews.contentHeadline[number]
    tvDateHeadline.text = DataNews.dateHeadline[number]
    tvAuthorHeadline.text = DataNews.authorHeadline[number]


    view.setOnClickListener {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra("title", DataNews.titleHeadline[number])
        intent.putExtra("date", DataNews.dateHeadline[number])
        intent.putExtra("author", DataNews.authorHeadline[number])
        intent.putExtra("content", DataNews.contentHeadline[number])
        intent.putExtra("image", DataNews.photoHeadline[number])
        context.startActivity(intent)
    }



}