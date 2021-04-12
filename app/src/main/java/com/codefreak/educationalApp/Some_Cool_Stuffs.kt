package com.codefreak.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Some_Cool_Stuffs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_some__cool__stuffs)
    }

    fun SiliconVally(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2575988/"))
        startActivity(intent)
    }
    fun MrRobot(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt4158110/"))
        startActivity(intent)
    }
    fun SocialNetwork(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt1285016/"))
        startActivity(intent)
    }
    fun Snowden(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt3774114/"))
        startActivity(intent)
    }
    fun Pirates(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt0168122/"))
        startActivity(intent)
    }
    fun Jobs(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2357129/"))
        startActivity(intent)
    }

    fun Internship(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2234155/"))
        startActivity(intent)
    }
    fun ImitationGame(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2084970/"))
        startActivity(intent)
    }
    fun Matrix(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt0133093/"))
        startActivity(intent)
    }

    fun BlackMirror(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2085059/"))
        startActivity(intent)
    }
}