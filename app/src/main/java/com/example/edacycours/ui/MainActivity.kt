package com.example.edacycours.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.edacycours.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.main_navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, null)
        NavigationUI.setupWithNavController(navigation as BottomNavigationView, navController)
    }
    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.main_navigation_fragment).navigateUp()
}
