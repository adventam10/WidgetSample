package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewStub

class SpecialTagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_special_tag)

        val viewStub = findViewById<ViewStub>(R.id.view_stub)
        viewStub.inflate()
    }
}
