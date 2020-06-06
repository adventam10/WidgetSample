package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridView

class GridViewActivity : AppCompatActivity() {
    companion object {
        private val TAG = GridViewActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        val gridView = findViewById<GridView>(R.id.grid)
        val adapter = GridViewAdapter(this,
            listOf(R.drawable.botman_red, R.drawable.botman_blue, R.drawable.botman_green,
                R.drawable.botman_yellow, R.drawable.botman_pink, R.drawable.botman_black,
                R.drawable.botman_orange, R.drawable.botman_purple))
        gridView.adapter = adapter
        gridView.setOnItemClickListener { _, _, position, id ->
            Log.d(TAG, "Click! position: $position, id: $id")
        }
    }
}
