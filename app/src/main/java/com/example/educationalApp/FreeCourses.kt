package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.elearningapp.R

class FreeCourses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free_courses)
    }
    fun channelone(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/dsa_one"))
        startActivity(browserIntent)
    }
    fun channeltwo(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ultimateudemy"))
        startActivity(browserIntent)


    }

    fun channelthree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/codingguy"))
        startActivity(browserIntent)

    }

    fun channelfour(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/coding_enthusiasts"))
        startActivity(browserIntent)

    }
    fun channelfive(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/aman_dhattarwal"))
        startActivity(browserIntent)
    }
    fun Instaone(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/programmer.me/?hl=en"))
        startActivity(browserIntent)
    }
    fun Instatwo(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/java.world/?hl=en"))
        startActivity(browserIntent)
    }
    fun Instathree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/python.learning/?hl=en"))
        startActivity(browserIntent)

    }
    fun Instafour(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pure.python/?igshid=1pnpu96mfb8i6"))
        startActivity(browserIntent)

    }
    fun ytone(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "174p2BjUw0M"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun yttwo(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "nn9fF2wz3h4"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
}