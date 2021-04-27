package com.codfreak.elearningapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_register.*

class Second_Year : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second__year)

        MobileAds.initialize(this@Second_Year)
        val adRequest1 = AdRequest.Builder().build()
        adView.loadAd(adRequest1)
    }
    fun Oopm(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1DY1mXmvwbmjPlgiRMZWsG3kKsuVN7J_Z"))
        startActivity(browserIntent)
    }

    fun M3(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1ErHtqDr2D9ig47wuJbls57sB_4GZBSaf"))
        startActivity(browserIntent)
    }
    fun EEE(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1ZF0XAnTFELugSUalMe74nGs7Ch1Kkuc_"))
        startActivity(browserIntent)
    }

    fun DS(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1XBzxEQvMYeWDJMF9hs40o3uh6HhcmKd_"))
        startActivity(browserIntent)
    }
    fun Disy(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1TVhdEweBDahWLjqQ032zFtNLqhg_owC9"))
        startActivity(browserIntent)
    }
    fun Dastru(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/16xZhIX034JwJ81plsEjV5MdgcgBNDKDD"))
        startActivity(browserIntent)
    }

    fun COA(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/10iEyjVp__hmrA8Kyon7JdSm6NABZ4cq7"))
        startActivity(browserIntent)
    }
    fun ADA(view: View) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/u/2/folders/1r-k3_PTiWdKfWodvQvidzvpfL7CAFn9W"))
        startActivity(browserIntent)
    }
}