package com.example.widgetsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list)
        val list = listOf("Texts", "EditTexts", "Buttons", "WebView", "VideoView", "CalendarView",
            "Widgets", "ContainerSpecialTags", "Containers", "RecyclerView", "ViewPager", "GridView",
            "LinearLayout", "RelativeLayout", "FrameLayout", "TableLayout", "GridLayout")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val text = adapter.getItem(position)
            val intent = when (Menu.valueOf(text!!)) {
                Menu.Texts -> Intent(this, TextActivity::class.java)
                Menu.EditTexts -> Intent(this, EditTextActivity::class.java)
                Menu.Buttons -> Intent(this, ButtonActivity::class.java)
                Menu.WebView -> Intent(this, WebViewActivity::class.java)
                Menu.VideoView -> Intent(this, VideoViewActivity::class.java)
                Menu.CalendarView -> Intent(this, CalendarViewActivity::class.java)
                Menu.Widgets -> Intent(this, WidgetActivity::class.java)
                Menu.ContainerSpecialTags -> Intent(this, SpecialTagActivity::class.java)
                Menu.Containers -> Intent(this, ContainerActivity::class.java)
                Menu.RecyclerView -> Intent(this, RecyclerViewActivity::class.java)
                Menu.ViewPager -> Intent(this, ViewPagerActivity::class.java)
                Menu.GridView -> Intent(this, GridViewActivity::class.java)
                Menu.LinearLayout -> Intent(this, LinearLayoutActivity::class.java)
                Menu.RelativeLayout -> Intent(this, RelativeLayoutActivity::class.java)
                Menu.FrameLayout -> Intent(this, FrameLayoutActivity::class.java)
                Menu.TableLayout -> Intent(this, TableLayoutActivity::class.java)
                Menu.GridLayout -> Intent(this, GridLayoutActivity::class.java)
            }

            startActivity(intent)
        }
    }
}

enum class Menu {
    Texts, EditTexts, Buttons, WebView, VideoView, CalendarView, Widgets,
    ContainerSpecialTags, Containers, RecyclerView, ViewPager, GridView,
    LinearLayout, RelativeLayout, FrameLayout, TableLayout, GridLayout;
}