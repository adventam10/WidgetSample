package com.example.widgetsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class NavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        val navController = findNavController(R.id.fragment)
        findViewById<NavigationView>(R.id.nav_view)
            .setupWithNavController(navController)
        findViewById<BottomNavigationView>(R.id.bottom_nav_view)
            .setupWithNavController(navController)
    }
}
