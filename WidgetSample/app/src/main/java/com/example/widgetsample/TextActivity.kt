package com.example.widgetsample

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class TextActivity : AppCompatActivity() {
    companion object {
        private val TAG = TextActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val editText = findViewById<EditText>(R.id.edit_text)
        editText.setText("Test", TextView.BufferType.NORMAL)
        editText.text.toString()
        editText.addTextChangedListener(object : TextWatcher {
            // 文字１つを入力した時に呼び出される
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                Log.d(TAG, "onTextChanged! ${s.toString()}, start: $start, before: $before, count: $count")
            }

            // 文字列が修正される直前に呼び出される
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                Log.d(TAG, "beforeTextChanged! ${s.toString()}, start: $start, count: $count, after: $after")
            }

            // 文字列が変更されたときに呼び出される。
            override fun afterTextChanged(s: Editable) {
                Log.d(TAG, "afterTextChanged! ${s.toString()}")
            }
        })
    }
}
