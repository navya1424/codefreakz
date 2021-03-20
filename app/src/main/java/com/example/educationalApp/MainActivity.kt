package com.example.elearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.educationalApp.CProgramming
import com.example.educationalApp.Dsa
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Adapter.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val item = ArrayList<CustomClass>()

        item.add(CustomClass("C",R.drawable.clogo))
        item.add(CustomClass("C++",R.drawable.cpplogo))





        item.add(CustomClass("Java",R.drawable.javalogo))
        item.add(CustomClass("Python",R.drawable.pylogo))
        item.add(CustomClass("DataStructure Algorithm",R.drawable.dsa))
        item.add(CustomClass("Engineering Subjects",R.drawable.engsubs))
        item.add(CustomClass("Android Development",R.drawable.androidlogo))
        item.add(CustomClass("Web Development",R.drawable.weblogo))
        item.add(CustomClass("Machine Learning",R.drawable.mllogo))
        item.add(CustomClass("Competitive Programming",R.drawable.cplogo))

        item.add(CustomClass("Git/Github",R.drawable.git))



        item.add(CustomClass("Kotlin",R.drawable.kotlinlogo))
        item.add(CustomClass("Java Script",R.drawable.jslogo))

        item.add(CustomClass("Free Cources",R.drawable.cource))










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
            val intent = Intent(this,ccpppage::class.java)
            startActivity(intent)
        }
     else   if (position==2){
         val intent = Intent(this,java::class.java)
         startActivity(intent)
     }
     else   if (position==3){
         val intent = Intent(this,python::class.java)
         startActivity(intent)
     }
     else   if (position==4){
         val intent = Intent(this, Dsa::class.java)
         startActivity(intent)
     }
     else   if (position==5){
         val intent = Intent(this, EngSubs::class.java)
         startActivity(intent)
     }
     else   if (position==6){
         val intent = Intent(this, androiddevelopment::class.java)
         startActivity(intent)
     }
     else   if (position==7){
         val intent = Intent(this, webdevelopment::class.java)
         startActivity(intent)
     }


     }
    }



