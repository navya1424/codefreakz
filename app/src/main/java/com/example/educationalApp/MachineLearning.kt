package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.elearningapp.R

class MachineLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)
    }

    fun MLRoadmap1(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "mlxoB3wI9eY"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }

    fun MLRoadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "6uE4nfFgc5Q"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }
    fun MLYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG"))
        startActivity(browserIntent)
    }
    fun MLYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLEiEAq2VkUULYYgj13YHUWmRePqiu8Ddy"))
        startActivity(browserIntent)
    }
    fun MLinonevideo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "GwIo3gDZCVQ"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun MLFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/data-science-machine-learning-data-analysis-python-r/"))
        startActivity(browserIntent)

    }
    fun MLFreeCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/learn/machine-learning?action=enroll"))
        startActivity(browserIntent)

    }
    fun MLPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/learn/machine-learning?action=enroll"))
        startActivity(browserIntent)

    }
    fun MLPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/deeplearning/?LSNPUBID=JVFxdTr9V80&ranEAID=JVFxdTr9V80&ranMID=39197&ranSiteID=JVFxdTr9V80-1DrYmwVztRZYOvUtcyc5Sg&utm_medium=udemyads&utm_source=aff-campaign"))
        startActivity(browserIntent)

    }
    fun MLInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "h4Ml9WuhxAk"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun MLProjectIdeas(view: View) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sj1-OO5AGmc"))
        startActivity(browserIntent)

    }


}