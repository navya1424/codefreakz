package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class python : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_python)
    }
    fun pythonRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "ZWI-jrnbMhA"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }

    fun pythonRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "bPrmA1SEN2k"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }
    fun pythonYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agICnT8t4iYVSZ3eykIAOME"))
        startActivity(browserIntent)
    }
    fun pythonYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3"))
        startActivity(browserIntent)
    }
    fun pythoninonevideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "gfDE2a7MKjA"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun pythonFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/python-3-for-total-beginners/"))
        startActivity(browserIntent)

    }
    fun pythonFreeCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/learn-python-with-real-world-examples-and-job-interview-question/"))
        startActivity(browserIntent)

    }
    fun pythonPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/complete-python-bootcamp/"))
        startActivity(browserIntent)

    }
    fun pythonPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/specializations/python-3-programming"))
        startActivity(browserIntent)

    }
    fun PythonInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "B_17_RORoiI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun PythonProjectIdeas(view: View) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uxWMUV_9fKU"))
        startActivity(browserIntent)

    }
    fun Pythonnotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DfJcIC2pe_zhmsV3j1g7zzgJaInFkKuA/view?usp=sharing"))
        startActivity(browserIntent)
    }


    fun pythonBook(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1caFKAIUCbBaTAUhr0g5JxsTacDDPuy-G/view?usp=sharing"))
        startActivity(browserIntent)
    }

}
