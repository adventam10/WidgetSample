package com.example.widgetsample

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class VideoViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)

        val videoView = findViewById<VideoView>(R.id.video)
        videoView.setMediaController(MediaController(this))
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.sample))
        videoView.start()
    }
}
