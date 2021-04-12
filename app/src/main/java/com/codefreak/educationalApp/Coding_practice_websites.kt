package com.codefreak.educationalApp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Coding_practice_websites : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coding_practice_websites)
    }

    fun wthree(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/"))
        startActivity(browserIntent)


    }

    fun hackerank(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hackerrank.com/dashboard "))
        startActivity(browserIntent)


    }
    fun HackerEarth(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hackerearth.com/practice/"))
        startActivity(browserIntent)
    }
    fun GFG(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://practice.geeksforgeeks.org/topic-tags/"))
        startActivity(browserIntent)
    }
    fun LeetCode(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://leetcode.com/"))
        startActivity(browserIntent)
    }
    fun CodeChef(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codechef.com/snackdown/2016/practice"))
        startActivity(browserIntent)

    }
    fun CodeForces(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://codeforces.com/profile/practice"))
        startActivity(browserIntent)

    }
    fun CodinGame(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codingame.com/start"))
        startActivity(browserIntent)

    }
    fun SPOJ(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spoj.com/"))
        startActivity(browserIntent)

    }
    fun InterviewBit(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.interviewbit.com/practice/"))
        startActivity(browserIntent)
    }
    fun Codewars(view: View) {

        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codewars.com/"))
        startActivity(browserIntent)

    }




}