package com.example.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class androiddevelopment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_androiddevelopment)
    }
    fun PaidCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/the-complete-web-development-bootcamp"))
        startActivity(browserIntent)
    }

    fun Android(view: View) {
        val btn =findViewById<Button>(R.id.android)
        val videoId = "umzJU6OzjNI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun ProjectIdeas(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "uXYqLh7nikw"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }

    fun FreeCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.udacity.com/courses/ud851"))
        startActivity(browserIntent)
    }

    fun Roadmap(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "BakbEAyXoMI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }

    fun Roadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "A14BLDzNy2k"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }


    fun YtPlayList1(view: View) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLUcsbZa0qzu3Mri2tL1FzZy-5SX75UJfb"))
        startActivity(browserIntent)
    }

    fun YtPlaylist2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "mXjZQX3UzOs"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

}
