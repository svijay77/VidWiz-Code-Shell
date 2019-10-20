package com.example.vidwiz_learningvideoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.net.Uri
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView




class Math_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.math_page)
        val videoView = findViewById<VideoView>(R.id.videoView)
        val path = "android.resource://proper_factorization.mp4/R.raw.a"
        videoView?.setVideoURI(Uri.parse(path))

        val button = findViewById<Button>(R.id.button)
        button?.setOnClickListener {
            val isPlaying = videoView.isPlaying
            button.setText(if (isPlaying) R.string.play else R.string.pause)

            val msg = getString(if (isPlaying) R.string.paused else R.string.playing)
            Toast.makeText(this@Math_page, msg, Toast.LENGTH_SHORT).show()
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }

        }
        fun sendToHome (view: View) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

