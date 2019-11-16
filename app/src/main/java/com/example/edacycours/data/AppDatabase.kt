package com.example.edacycours.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.edacycours.data.dao.WebsiteDao
import com.example.edacycours.data.model.Website


@Database(entities = [Website::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun websiteDao(): WebsiteDao
}