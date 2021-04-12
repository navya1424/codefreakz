package com.codefreak.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FreeCourses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free_courses)
    }
    fun channelone(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/deadprogrammer"))
        startActivity(browserIntent)
    }
    fun channeltwo(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ultimateudemy"))
        startActivity(browserIntent)


    }

    fun channelthree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/codingguy"))
        startActivity(browserIntent)

    }

    fun Website(view: View) {
        val browserIntent = Intent(this, Coding_practice_websites::class.java)
        startActivity(browserIntent)

    }



    fun Instatwo(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/java.world/?hl=en"))
        startActivity(browserIntent)
    }
    fun Instathree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/python.hub/"))
        startActivity(browserIntent)

    }
    fun Instafour(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pure.python/?igshid=1pnpu96mfb8i6"))
        startActivity(browserIntent)

    }

    fun OFFCAMPUS(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/joinchat/Ihu1hhB_c5K_z7KzyrTIxQ"))
        startActivity(browserIntent)
    }
    fun CodingQuestion(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/itchallenges/"))
        startActivity(browserIntent)
    }


    fun RedditJava(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/java"))
        startActivity(browserIntent)
    }
    fun RedditJs(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/javascript/"))
        startActivity(browserIntent)
    }
    fun CyberSecurity(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cyberhawksecurity/"))
        startActivity(browserIntent)
    }
    fun AppDevlopement(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/android_dev_tips/"))
        startActivity(browserIntent)
    }
    fun PythonDiscord(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/python"))
        startActivity(browserIntent)
    }

    fun RedditAndroid(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/androiddev/"))
        startActivity(browserIntent)
    }

    fun RedditKotlin(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Kotlin/"))
        startActivity(browserIntent)
    }

    fun ProgrammingNews(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/programming/"))
        startActivity(browserIntent)
    }

    fun codefreakz(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/joinchat/PPBWbuXWGRkyNDg1"))
        startActivity(browserIntent)
    }

}