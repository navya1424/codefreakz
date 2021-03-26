package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.elearningapp.R

class CollegeRoadmap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_college_roadmap)
    }

    fun lovebabbar(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "xxgsHDQ0eJg"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun parttwo(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "Z1KfAotr0NQ"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }

    fun second(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "CF1j_wMEbPA"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun Final_year(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "VY6003vijLw"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)


    }
    fun first(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "6qOnlu95ez8"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun off_campus(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "w5B_VFDDw-Q"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun off_campus_two(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "kzIa-4xl7yU"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun MBA(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "kucdvETQHWQ"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun coder(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "tIAydH3NnJk"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun college(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "PihtA9D-IlE"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }
    fun internship(view: View) {
        val btn =findViewById<Button>(R.id.java)
        val videoId = "RgOxazZp_eE"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
}