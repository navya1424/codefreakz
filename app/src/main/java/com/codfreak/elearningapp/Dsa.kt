package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Dsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsa)
    }



    fun DSARoadmap(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=c_w2LhuiJ1o"))
        startActivity(intent)
    }
    fun YTPlaylistdsa1(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU"))
        startActivity(intent)
    }
    fun YTPlaylistdsa2(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p"))
        startActivity(intent)
    }

    fun DSCPP(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/data-structures-for-beginners-c-plusplus/"))
        startActivity(intent)
    }
    fun PaidCourse(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://practice.geeksforgeeks.org/courses/dsa-self-paced"))
        startActivity(intent)
    }
    fun DSABook(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NQnRwXdMzpVRyjtUQxLxgOWHQxM-k2Nq/view?usp=sharing "))
        startActivity(intent)
    }
    fun AlgoBook(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1TzNX0GqaOZilyjCDwZURjl_FGHzG-UJQ/view"))
        startActivity(intent)
    }


}