package com.example.vidwiz_learningvideoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class English_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_page)
    }
    fun sendToHome (view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
