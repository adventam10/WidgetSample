package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonActivity : AppCompatActivity() {
    companion object {
        private val TAG = ButtonActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.d(TAG, "Button click!")
        }

        val imageButton = findViewById<ImageButton>(R.id.image_button)
        imageButton.setOnClickListener {
            Log.d(TAG, "ImageButton click!")
        }

        val chipGroup = findViewById<ChipGroup>(R.id.chip_group)
        chipGroup.check(R.id.chip2)
        val chipId = chipGroup.checkedChipId
        Log.d(TAG, "ChipGroup Selected! id: $chipId")
        chipGroup.setOnCheckedChangeListener { group, id ->
            Log.d(TAG, "ChipGroup CheckedChange! id: $id")
        }

        val checkBox = findViewById<CheckBox>(R.id.check_box)
        checkBox.isChecked = true
        checkBox.setOnClickListener {
            Log.d(TAG, "CheckBox click!")
        }
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d(TAG, "CheckBox CheckedChange! isChecked: $isChecked")
        }

        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
        radioGroup.check(R.id.radio1)
        val id = radioGroup.checkedRadioButtonId
        Log.d(TAG, "RadioGroup Selected! id: $id")
        radioGroup.setOnCheckedChangeListener { group, id ->
            Log.d(TAG, "RadioGroup CheckedChange! id: $id")
        }

        val toggleButton = findViewById<ToggleButton>(R.id.toggle_button)
        toggleButton.isChecked = true
        toggleButton.setOnClickListener {
            Log.d(TAG, "ToggleButton click!")
        }
        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d(TAG, "ToggleButton CheckedChange! isChecked: $isChecked")
        }

        val switch = findViewById<Switch>(R.id.toggle_switch)
        switch.isChecked = true
        switch.setOnClickListener {
            Log.d(TAG, "Switch click!")
        }
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d(TAG, "Switch CheckedChange! isChecked: $isChecked")
        }

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            Log.d(TAG, "FloatingActionButton click!")
        }

    }
}
