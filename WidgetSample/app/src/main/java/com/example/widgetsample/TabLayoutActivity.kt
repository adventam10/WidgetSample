package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val viewPager = findViewById<ViewPager>(R.id.pager)
        val adapter = SampleFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        val tabLayout = findViewById<TabLayout>(R.id.tab)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.let {
            it.text = "TabA"
        }
        tabLayout.getTabAt(1)?.let {
            it.text = ""
            it.setIcon(R.drawable.botman_black)
        }
        tabLayout.getTabAt(2)?.let {
            it.text = "TabC"
            it.setIcon(R.drawable.botman_red)
        }
    }
}
