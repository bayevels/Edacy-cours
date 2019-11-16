package com.example.edacycours

import android.app.Application
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.edacycours.data.AppDatabase
import com.example.edacycours.data.model.Website
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

val database: AppDatabase by lazy {
    EdacyCoursApplication.database!!
}

class EdacyCoursApplication : Application() {

    companion object {
        lateinit var instance: EdacyCoursApplication
            private set

        lateinit var database: AppDatabase
    }

    override fun onCreate(){
        super.onCreate()
        instance = this
        initilization()
    }

    private fun initilization(){
        configDatabase()
    }

    private fun configDatabase(){
        database = Room
            .databaseBuilder(applicationContext, AppDatabase::class.java, "sentame-db")
            .fallbackToDestructiveMigration()
            .build()

        GlobalScope.launch(Dispatchers.IO) {
            database.websiteDao().insertAll(
                listOf(
                    Website(0,"seneweb", "www.seneweb.com"),
                    Website(0, "sanslimite", "www.sanslimite.com"),
                    Website(0, "senego", "www.senego.com")
                )
            )

            database.websiteDao().getAll()
        }
    }


}