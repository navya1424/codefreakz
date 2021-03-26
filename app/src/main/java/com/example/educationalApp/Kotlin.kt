package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.elearningapp.R

class Kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }

    fun KotlinRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "eVLPnewCMRI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }

    fun KotlinRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "LEi1ecigDFE"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }
    fun KotlinYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLsyeobzWxl7rooJFZhc3qPLwVROovGCfh"))
        startActivity(browserIntent)
    }
    fun KotlinYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLl4Y2XuUavmuH6xZKU7I5AdZkDs4JyWUN"))
        startActivity(browserIntent)
    }
    fun Kotlininonevideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "mnkzx3TwbV8"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun ytthree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G"))
        startActivity(browserIntent)

    }

    fun KotlinFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/one-hour-kotlin-guide-for-beginners/"))
        startActivity(browserIntent)

    }

    fun KotlinPaidCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/kotlin-java/"))
        startActivity(browserIntent)

    }
    fun KotlinInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "qq2u-QyNRjI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun KotlinProjectIdeas(view: View) {

        val btn =findViewById<Button>(R.id.java)
        val videoId = "KJ_o-JUgGo0"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun Kotlinnotes(view: View) {
        val btn =findViewById<Button>(R.id.DSNotes)
    }
    fun KotlinBook(view: View) {
        val btn =findViewById<Button>(R.id.DSBook)
    }



}