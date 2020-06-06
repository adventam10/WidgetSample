package com.example.widgetsample

import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class CalendarViewActivity : AppCompatActivity() {
    companion object {
        private val TAG = CalendarViewActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_view)

        val calendarView = findViewById<CalendarView>(R.id.calendar)
        // 一日前選択
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DATE, -1)
        calendarView.date = calendar.timeInMillis

        // 1月後を上限に設定
        calendar.add(Calendar.MONTH, 1)
        calendarView.maxDate = calendar.timeInMillis

        // 1月前を下限に設定
        calendar.add(Calendar.MONTH, -2)
        calendarView.minDate = calendar.timeInMillis

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            Log.d(TAG, "year: $year, month: $month, dayOfMonth: $dayOfMonth")
            val calendar = Calendar.getInstance()
            calendar.timeInMillis = view.date // これはまだ選択前の日付
            val beforeDate = calendar.time
            calendar.set(year, month, dayOfMonth)
            val selectedDate = calendar.time
            val format = "yyyy/MM/dd E HH:mm:ss"
            Log.d(TAG, DateFormat.format(format, beforeDate).toString())
            Log.d(TAG, DateFormat.format(format, selectedDate).toString())
        }
    }
}
