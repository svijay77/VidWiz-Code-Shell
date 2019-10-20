package com.example.vidwiz_learningvideoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendToEnglish (view: View){
        val intent = Intent(this, English_page::class.java)
        startActivity(intent)
    }
    fun sendToArt (view: View){
        val intent = Intent(this, Art_page::class.java)
        startActivity(intent)
    }
    fun sendToMath (view: View){
        val intent = Intent(this, Math_page::class.java)
        startActivity(intent)
    }

}
