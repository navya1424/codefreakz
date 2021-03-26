package com.example.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.educationalApp.First_Year
import kotlinx.android.synthetic.main.activity_eng_subs.*

class EngSubs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_subs)

    }

    fun FirstYear(view: View) {
        val mainActivityIntent = Intent(this, First_Year::class.java)
        startActivity(mainActivityIntent)
        finish()
    }

    fun SecondYear(view: View) {
        val mainActivityIntent = Intent(this, SecondYear::class.java)
        startActivity(mainActivityIntent)
        finish()
    }


    fun ThirdYear(view: View) {
        val mainActivityIntent = Intent(this, ThirdYear::class.java)
        startActivity(mainActivityIntent)
        finish()

    }


    fun FourthYear(view: View) {
        val mainActivityIntent = Intent(this, FourthYear::class.java)
        startActivity(mainActivityIntent)
        finish()
    }



}