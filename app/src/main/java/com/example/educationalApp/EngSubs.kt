package com.example.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.educationalApp.First_Year
import com.example.educationalApp.Second_Year
import com.example.educationalApp.Third_Year
import kotlinx.android.synthetic.main.activity_eng_subs.*

class EngSubs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng_subs)

    }

    fun FirstYear(view: View) {
        val intent = Intent(this, First_Year::class.java)
        startActivity(intent)

    }
    fun SecondYear(view: View) {
        val intent = Intent(this, Second_Year::class.java)
        startActivity(intent)

    }
    fun ThirdYear(view: View) {
        val intent = Intent(this, Third_Year::class.java)
        startActivity(intent)

    }



}