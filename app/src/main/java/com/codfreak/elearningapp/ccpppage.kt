package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ccpppage : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ccpppage)



        
    }

    fun cppRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "Fh4IaB0y3Ms"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun cppRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "qszBRjWZwuw"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun cppYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ"))
        startActivity(browserIntent)
    }
    fun cppYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL"))
        startActivity(browserIntent)
    }

    fun cppinonevideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "yGB9jhsEsr8"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun cppFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/free-learn-c-tutorial-beginners/"))
        startActivity(browserIntent)
    }
    fun cppFreeCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/course/c-for-programmers--ud210"))
        startActivity(browserIntent)
    }
    fun cppPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/beg-modern-cpp/"))
        startActivity(browserIntent)
    }
    fun cppPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/specializations/coding-for-everyone"))
        startActivity(browserIntent)
    }
    fun cppInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "x3XQS3unskM"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun cppProjectIdeas(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLRJuRxIsYMUX3iSmvyWPdKFaCooL455YQ"))
        startActivity(browserIntent)
    }
    fun cppnotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YnK3D3s1uE4K8KQcSzbDj4J4sMJwBRci/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun cppBook(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1N14SYUvOORgT3rjGDGAnhqi8XEosGkLx/view?usp=sharing"))
        startActivity(browserIntent)
    }

}
