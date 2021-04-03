package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.elearningapp.R

class GitGitHub : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_git_hub)
    }

    fun GitGithubRoadmap1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/basic-git-commands-with-examples/"))
        startActivity(browserIntent)
    }

    fun GitYtPlayList1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PL4cUxeGkcC9goXbgTDQ0n_4TBzOO0ocPR"))
        startActivity(browserIntent)
    }


    fun GitYtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9ahVQekD7ePHmnirTePXwIln"))
        startActivity(browserIntent)
    }

    fun Gitinonevideo(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uj4fy4kpaOA"))
        startActivity(browserIntent)

    }


    fun GitFreeCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/git-expert-4-hours/"))
        startActivity(browserIntent)
    }

    fun GitFreeCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/course/version-control-with-git--ud123"))
        startActivity(browserIntent)
    }

    fun GitPaidCourse1(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/git-and-github-bootcamp/"))
        startActivity(browserIntent)

    }

    fun GitPaidCourse2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/learn/introduction-git-github"))
        startActivity(browserIntent)
    }

    fun GitInterviewQuestions(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "8Xo3l1zv41I"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }
    fun Gitnotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rrTSQeCOK2w9PQEhCm-xzTu6Ql-l9xdX/view?usp=sharing"))
        startActivity(browserIntent)
    }

}