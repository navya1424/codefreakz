package com.codefreak.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class java : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
    }

    fun javaPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/master-practical-java-development/"))
        startActivity(browserIntent)
    }

    fun javaPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/specializations/java-programming"))
        startActivity(browserIntent)
    }


    fun javaInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "oYXivKMSEqM"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun javaProjectIdeas(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PL5BFcXE899zzCSw0G--BYidzhydyaQBYA"))
        startActivity(browserIntent)

    }


    fun javaFreeCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/java-tutorial/"))
        startActivity(browserIntent)
    }

    fun javaFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/course/java-programming-basics--ud282"))
        startActivity(browserIntent)
    }

    fun javaRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "c4z-LkNea1k"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }

    fun javaRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "DC5wtYGQ7XE"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun javaYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s"))
        startActivity(browserIntent)

    }
    fun javaYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q"))
        startActivity(browserIntent)
    }

    fun javaOneVideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "aQatrXw0njs"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun javanotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-X91sBdoyIJCH1kZLxkDLKu-akh63vdu/view?usp=sharing"))
        startActivity(browserIntent)
    }

    fun Javabook(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19Dqc1oT7QPNRKq2di1WePeF1rKsiIAlS/view?usp=sharing"))
        startActivity(browserIntent)
    }
}
