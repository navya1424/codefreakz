package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class webdevelopment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webdevelopment)

    }

    fun PaidCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/the-complete-web-development-bootcamp"))
        startActivity(browserIntent)
    }

    fun nodejs(view: View) {
        val btn =findViewById<Button>(R.id.nodejs)
        val videoId = "umzJU6OzjNI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun ProjectIdeas(view: View) {
        val btn =findViewById<Button>(R.id.project_ideas)
        val videoId = "SI5ISZa0IL0"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }

    fun FreeCourse(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://digitaldefynd.com/best-free-web-development-courses-tutorials-certification/"))
        startActivity(browserIntent)
    }

    fun Roadmap(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "GLk7-imcjiI"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)

    }

    fun Roadmap2(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "nknwAOtmtDk"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun YtPlaylist2(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agiCUZYRsvtGTXdxkzPyItg"))
        startActivity(browserIntent)

    }
    fun YtPlayList1(view: View) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n"))
        startActivity(browserIntent)
    }

    fun YtPlaylist3(view: View) {
        val btn =findViewById<Button>(R.id.roadmap_btn2)
        val videoId = "Q33KBiDriJY"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
        intent.putExtra("VIDEO_ID", videoId)
        startActivity(intent)
    }

    fun ReactNotes(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W2uSlrGvgndSamCpxAQyS7AwNYzL_ZE8/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun MongoDB(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1A1flQqWMZVfYqhEAwNi0_Nfe889_cSjc/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun JQuery(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ri2wYz8kGDg5JINAMf3tg9AUf5CrQQQc/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun HTML(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IPojz6wjgqtf_u6fufctw8A3QLGhM3D5/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun CSS(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rr-SrVHsImU7Zvx08cckq7tJnKMtwBc1/view?usp=sharing"))
        startActivity(browserIntent)
    }

    fun Angular(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/177iv3Pz5Sz2MgJ6iSyEcnZMMECG6tlX2/view?usp=sharing"))
        startActivity(browserIntent)
    }
}