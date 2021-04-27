package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Job_Opportunities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job__opportunities)
    }

    fun SE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://collegegrad.com/careers/software-developers"))
        startActivity(browserIntent)
    }

    fun WE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.greatsampleresume.com/job-responsibilities/electrical-engineering/wireless-engineer"))
        startActivity(browserIntent)
    }
    fun NA(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thebalancecareers.com/network-administrator-525818"))
        startActivity(browserIntent)
    }
    fun MLE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.roberthalf.com/blog/the-future-of-work/how-to-become-a-machine-learning-engineer"))
        startActivity(browserIntent)
    }

    fun DSE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.northeastern.edu/graduate/blog/what-does-a-data-scientist-do/"))
        startActivity(browserIntent)
    }
    fun CGD(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://study.com/articles/Computer_Graphics_Designer_Job_Duties_and_Requirements_for_a_Career_in_Computer_Graphics_Design.html"))
        startActivity(browserIntent)
    }
    fun CHE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thebalancecareers.com/computer-hardware-engineer-525999"))
        startActivity(browserIntent)
    }
    fun Database(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://money.usnews.com/careers/best-jobs/database-administrator"))
        startActivity(browserIntent)
    }
    fun EH(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shiksha.com/it-software/articles/ethical-hacking-scope-and-future-ahead-blogId-24531"))
        startActivity(browserIntent)
    }
    fun DataAnalyst(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.northeastern.edu/graduate/blog/what-does-a-data-analyst-do/"))
        startActivity(browserIntent)
    }
    fun AD(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.valuecolleges.com/resources/job-description-mobile-developer/"))
        startActivity(browserIntent)
    }
    fun WEB(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://collegegrad.com/careers/web-developers"))
        startActivity(browserIntent)
    }
    fun SystemDesigner(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cgspectrum.com/career-pathways/systems-designer"))
        startActivity(browserIntent)
    }

    fun Devops(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lucidchart.com/blog/devops-engineer-roles-and-responsibilities"))
        startActivity(browserIntent)
    }
    fun CyberSecurityEngineer(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.simplilearn.com/tutorials/cyber-security-tutorial/how-to-become-cyber-security-engineer"))
        startActivity(browserIntent)
    }
}