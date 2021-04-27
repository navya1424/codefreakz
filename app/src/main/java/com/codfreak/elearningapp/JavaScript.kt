package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class JavaScript : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_script)
    }
    fun javascriptRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "gSnbnYffz7k"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }

    fun javascriptRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "ag0-D-srh9E"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }
    fun javascriptYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLsyeobzWxl7qtP8Lo9TReqUMkiOp446cV"))
        startActivity(browserIntent)
    }
    fun javascriptYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9ajyk081To1Cbt2eI5913SsL"))
        startActivity(browserIntent)
    }
    fun javascriptinonevideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "onbBV0uFVpo"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun javascriptFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/javascript-essentials/"))
        startActivity(browserIntent)

    }
    fun javascriptFreeCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codecademy.com/learn/introduction-to-javascript"))
        startActivity(browserIntent)

    }
    fun javascriptPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/the-complete-javascript-course/"))
        startActivity(browserIntent)
    }
    fun javascriptPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edx.org/course/javascript-introduction"))
        startActivity(browserIntent)

    }
    fun javascriptInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "0XZUdS2YTdw"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun javascriptProjectIdeas(view: View) {

        val btn =findViewById<Button>(R.id.java)
        val videoId = "YK4sH0g_gAA"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun javascriptnotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1pqDosGdP46h3LfCgZJbsu7FNgMWphJn3/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun javascriptBook(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1EnPucsTkGi6yliy-_RsywumnOjMPl6EY/view?usp=sharing"))
        startActivity(browserIntent)
    }



}