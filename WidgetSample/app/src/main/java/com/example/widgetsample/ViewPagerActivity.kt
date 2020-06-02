package com.example.widgetsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPager = findViewById<ViewPager>(R.id.pager)
        val adapter = SampleFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
    }
}
