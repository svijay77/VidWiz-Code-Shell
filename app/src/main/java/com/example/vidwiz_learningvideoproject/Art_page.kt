package com.example.vidwiz_learningvideoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Art_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.art_page)
    }
    fun sendToHome (view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
