package com.codefreak.educationalApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd

class MainActivity : AppCompatActivity(),Adapter.OnItemClickListener {
    private lateinit var mInterstitialAdd : InterstitialAd
    private lateinit var mInterstitialAdd1 : InterstitialAd
    private lateinit var mInterstitialAdd2 : InterstitialAd
    private lateinit var mInterstitialAdd3 : InterstitialAd
    private lateinit var mInterstitialAdd4 : InterstitialAd
    private lateinit var mInterstitialAdd5 : InterstitialAd
    private lateinit var mInterstitialAdd6 : InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        mInterstitialAdd = InterstitialAd(this)
            mInterstitialAdd.adUnitId = "ca-app-pub-4427927167262449/9274061423"
            mInterstitialAdd.loadAd(AdRequest.Builder().build())

            mInterstitialAdd.adListener = object : AdListener() {
                override fun onAdClosed() {
                    Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
                }
            }

        mInterstitialAdd1 = InterstitialAd(this)
        mInterstitialAdd1.adUnitId = "ca-app-pub-4427927167262449/2708653075"
        mInterstitialAdd1.loadAd(AdRequest.Builder().build())

        mInterstitialAdd1.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }

        mInterstitialAdd2 = InterstitialAd(this)
        mInterstitialAdd2.adUnitId = "ca-app-pub-4427927167262449/5143244721"
        mInterstitialAdd2.loadAd(AdRequest.Builder().build())

        mInterstitialAdd2.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }
        mInterstitialAdd3 = InterstitialAd(this)
        mInterstitialAdd3.adUnitId = "ca-app-pub-4427927167262449/7577836372"
        mInterstitialAdd3.loadAd(AdRequest.Builder().build())

        mInterstitialAdd3.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }
        mInterstitialAdd4 = InterstitialAd(this)
        mInterstitialAdd4.adUnitId = "ca-app-pub-4427927167262449/4951673036"
        mInterstitialAdd4.loadAd(AdRequest.Builder().build())

        mInterstitialAdd4.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }

        mInterstitialAdd5 = InterstitialAd(this)
        mInterstitialAdd5.adUnitId = "ca-app-pub-4427927167262449/3447019678"
        mInterstitialAdd5.loadAd(AdRequest.Builder().build())

        mInterstitialAdd5.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }
        mInterstitialAdd6 = InterstitialAd(this)
        mInterstitialAdd6.adUnitId = "ca-app-pub-4427927167262449/3921855910"
        mInterstitialAdd6.loadAd(AdRequest.Builder().build())

        mInterstitialAdd6.adListener = object : AdListener() {
            override fun onAdClosed() {
                Toast.makeText(this@MainActivity, "Add Closed", Toast.LENGTH_SHORT).show()
//                Toast.makeText(this, "Add Closed", Toast.LENGTH_SHORT).show()
            }
        }

        title = "KotlinApp"
        val item = ArrayList<CustomClass>()

        item.add(CustomClass("C",R.drawable.clogo))
        item.add(CustomClass("C++",R.drawable.cpplogo))
        item.add(CustomClass("Java",R.drawable.javalogo))
        item.add(CustomClass("Python",R.drawable.pylogo))
        item.add(CustomClass("DataStructure Algorithm",R.drawable.dsa))
        item.add(CustomClass("Engineering Subjects",R.drawable.engsubs))
        item.add(CustomClass("Android Development",R.drawable.androidlogo))
        item.add(CustomClass("Web      " +
                "Development",R.drawable.weblogo))
        item.add(CustomClass("Machine    " +
                "      Learning",R.drawable.mllogo))
        item.add(CustomClass("Competitive Programming",R.drawable.cplogo))
        item.add(CustomClass("Git/Github",R.drawable.git))
        item.add(CustomClass("Kotlin",R.drawable.kotlinlogo))
        item.add(CustomClass("Java Script",R.drawable.jslogo))
        item.add(CustomClass("Resources",R.drawable.cource))
        item.add(CustomClass("Data          Science",R.drawable.ds))
        item.add(CustomClass("College Roadmap",R.drawable.college))
        item.add(CustomClass("Some Cool Stuffs",R.drawable.cool))
        item.add(CustomClass("Job Opportunities",R.drawable.job))











        val person = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = Adapter(item,applicationContext,this)
        person.layoutManager= GridLayoutManager(applicationContext,2)
        person.adapter=adapter
    }

    //
//    fun ccppButton(view: View) {
//        val intent = Intent(this,ccpppage::class.java)
//        startActivity(intent)
//    }
//
//    fun javaButton(view: View) {
//        val intent = Intent(this,java::class.java)
//        startActivity(intent)
//    }
//
//    fun pythonButton(view: View) {
//        val intent = Intent(this,python::class.java)
//        startActivity(intent)
//    }
//
//    fun androiddevelopmentButton(view: View) {
//        val intent = Intent(this,androiddevelopment::class.java)
//        startActivity(intent)
//    }
//
//    fun webdevelopmentButton(view: View) {
//        val intent = Intent(this,webdevelopment::class.java)
//        startActivity(intent)
//    }
    override fun onItemClick(position: Int) {
     if (position==0){
         val intent = Intent(this,CProgramming::class.java)
         startActivity(intent)
     }
      else   if (position==1){
         if(mInterstitialAdd.isLoaded){
             mInterstitialAdd.show()
         }
             val intent = Intent(this, ccpppage::class.java)
             startActivity(intent)
        }
     else   if (position==2){
         val intent = Intent(this, java::class.java)
         startActivity(intent)
     }
     else   if (position==3){
         val intent = Intent(this, python::class.java)
         startActivity(intent)
     }
     else   if (position==4){
         if(mInterstitialAdd1.isLoaded){
             mInterstitialAdd1.show()
         }
         val intent = Intent(this, Dsa::class.java)
         startActivity(intent)
     }
     else   if (position==5){
         val intent = Intent(this, EngSubs::class.java)
         startActivity(intent)
     }
     else   if (position==6){
         if(mInterstitialAdd2.isLoaded){
             mInterstitialAdd2.show()
         }
         val intent = Intent(this, androiddevelopment::class.java)
         startActivity(intent)
     }
     else   if (position==7){
         if(mInterstitialAdd3.isLoaded){
             mInterstitialAdd3.show()
         }

         val intent = Intent(this, webdevelopment::class.java)
         startActivity(intent)
     }
     else if (position==8) {
         val intent = Intent(this, MachineLearning::class.java)
         startActivity(intent)
     }
     else if (position==9) {

         if(mInterstitialAdd5.isLoaded){
             mInterstitialAdd5.show()
         }

         val intent = Intent(this, CP::class.java)
         startActivity(intent)
     }

     else if (position==10) {
         if(mInterstitialAdd6.isLoaded){
             mInterstitialAdd6.show()
         }
         val intent = Intent(this, GitGitHub::class.java)
         startActivity(intent)
     }
     else if (position==11) {
         val intent = Intent(this, Kotlin::class.java)
         startActivity(intent)
     }
     else if (position==12) {
         val intent = Intent(this, JavaScript::class.java)
         startActivity(intent)
     }
     else if (position==13) {
         val intent = Intent(this, FreeCourses::class.java)
         startActivity(intent)
     }
     else if (position==14) {
         val intent = Intent(this, DataScience::class.java)
         startActivity(intent)
     }
     else if (position==15) {
         if(mInterstitialAdd4.isLoaded){
             mInterstitialAdd4.show()
         }

         val intent = Intent(this, CollegeRoadmap::class.java)
         startActivity(intent)
     }
     else if (position==16) {
         val intent = Intent(this, Some_Cool_Stuffs::class.java)
         startActivity(intent)
     }
     else if (position==17) {
         val intent = Intent(this, Job_Opportunities::class.java)
         startActivity(intent)
     }
     }

    }



