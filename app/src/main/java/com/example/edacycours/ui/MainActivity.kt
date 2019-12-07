package com.example.edacycours.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.edacycours.EdacyCoursApplication
import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
        GlobalScope.launch(Dispatchers.IO) {
            EdacyCoursApplication.database.articleDao().insertAll(
                listOf(
                    Article(1, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html","https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png"),
                    Article(2, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html", "https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png"),
                    Article(3, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html", "https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png")
                )
            )
        }
    }
    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.main_navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, null)
        NavigationUI.setupWithNavController(navigation as BottomNavigationView, navController)
    }
    override fun onSupportNavigateUp() = Navigation.findNavController(this, R.id.main_navigation_fragment).navigateUp()
}
