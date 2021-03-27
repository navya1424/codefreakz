package com.example.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.educationalApp.First_Year
import com.example.educationalApp.Second_Year
import com.example.educationalApp.Third_Year

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
    fun OSNOTES(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LirSZgmlXpWX0Q5htx1rvosDQjzq_h0T/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun DBMSNOTES(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WUUwqDGrt5_gxgCeT_j2WHQz7vg1bQxZ/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun LINUXNOTES(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_PZXoGgakdO5YHAMcqgnKbk2UHphpn1I/view?usp=sharing"))
        startActivity(browserIntent)
    }
    fun SENOTES(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1EOuPOk9dHN_zU8gTaSjwe3sLwULKdSII?usp=sharing"))
        startActivity(browserIntent)
    }



}