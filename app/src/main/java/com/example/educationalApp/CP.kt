package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.elearningapp.R

class CP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_p)
    }
    fun CPRoadmap(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RquBcwvgMbM"))
        startActivity(browserIntent)
    }


    fun CPYoutubePlaylist1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PL4PCksYQGLJOcaPLgeMFaxaHigPFjBuTG"))
        startActivity(browserIntent)
    }
    fun CPYoutubePlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLauivoElc3ggagradg8MfOZreCMmXMmJ-"))
        startActivity(browserIntent)
    }

    fun CPBASICS(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLl0KD3g-oDOEbtmoKT5UWZ-0_JbyLnHPZ"))
        startActivity(browserIntent)
    }
    fun TricksCp(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codingninjas.com/blog/2019/12/28/sharpen-your-sword-for-competitive-coding-with-these-tips/"))
        startActivity(browserIntent)
    }

    fun CPArticle(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/best-way-to-start-with-competitive-programming-geeksforgeeks-cp-live-course/"))
        startActivity(browserIntent)
    }
    fun PracticeCp(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/0/folders/1vH36jGLHE9CBYWn9GOhefdAP_4sEPpYD"))
        startActivity(browserIntent)
    }
}