package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RatingBar
import android.widget.SearchView
import android.widget.SeekBar

class WidgetActivity : AppCompatActivity() {
    companion object {
        private val TAG = WidgetActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)

        val seekBar = findViewById<SeekBar>(R.id.seek_bar)
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            // 変更時に呼ばれる
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                Log.d(TAG, "SeekBar onProgressChanged! progress: $progress, fromUser: $fromUser")
            }

            // ツマミがタッチされた時に呼ばれる
            override fun onStartTrackingTouch(seekBar: SeekBar) {
                Log.d(TAG, "SeekBar onStartTrackingTouch!")
            }

            // ツマミがリリースされた時に呼ばれる
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Log.d(TAG, "SeekBar onStopTrackingTouch!")
            }
        })
        seekBar.progress = 20

        val ratingBar = findViewById<RatingBar>(R.id.rating_bar)
        ratingBar.numStars = 5 // 星の数
        ratingBar.stepSize = 0.5F // ステップ数
        ratingBar.rating = 1.5F
        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Log.d(TAG, "RatingBar change! rating: $rating, fromUser: $fromUser")
        }

        val searchView = findViewById<SearchView>(R.id.search)
        searchView.queryHint = "Sample Text"
        searchView.setQuery("AAA", false)
        Log.d(TAG, "SearchView query: ${searchView.query.toString()}")
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                Log.d(TAG, "SearchView onQueryTextChange newText: $newText")
                return false // リスナーで処理する場合はtrue、SearchViewのデフォルトアクションならfalse
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                Log.d(TAG, "SearchView onQueryTextChange query: $query")
                return false // リスナーで処理する場合はtrue、SearchViewのデフォルトアクションならfalse
            }
        })
    }
}
