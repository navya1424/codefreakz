package com.example.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.elearningapp.R

class Third_Year : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third__year)
    }
    fun Toc(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/155B284ucoS2Eof3-q4cw_iIedBxRvXsa"))
        startActivity(browserIntent)
    }
    fun PM(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1r4fDIeP4kEldLg047C1-Js4bWToFTjp5"))
        startActivity(browserIntent)
    }

    fun ML(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1nYw5H8iM7MSmccIRc0YCL9UwhduX3kle"))
        startActivity(browserIntent)
    }

    fun IWT(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1LDeSV-BN8CsQtGG-bpELQdcgvdsMWfi1"))
        startActivity(browserIntent)
    }

    fun DBMS(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1TJdyaN-kCXqEv2zJXiVDDmXvUBM3bmmz"))
        startActivity(browserIntent)
    }

    fun Cybe(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1t3RqAUfVjuThkaTNVp3dG54gRep3qQvf"))
        startActivity(browserIntent)
    }
    fun CN(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1A9uFNiMtrW7KRUuoTWDiZwhkCE9zQGDr"))
        startActivity(browserIntent)
    }
    fun CD(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1rHJn07qkx9mLiyxZhb1ExWXjxDSwnYel"))
        startActivity(browserIntent)
    }
}