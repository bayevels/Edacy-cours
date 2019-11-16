package com.example.edacycours.data.repository

import androidx.lifecycle.LiveData
import com.example.edacycours.data.dao.WebsiteDao
import com.example.edacycours.data.model.Website
import com.example.edacycours.database


object WebsiteRepository:  BaseRepository<WebsiteDao> {

    override fun dao(): WebsiteDao {
        return database!!.websiteDao()
    }

    fun getWebsites(): LiveData<List<Website>> {
       return dao().getAll()
    }
}