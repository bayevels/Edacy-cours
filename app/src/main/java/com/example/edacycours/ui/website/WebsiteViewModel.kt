package com.example.edacycours.ui.website

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.edacycours.data.model.Website
import com.example.edacycours.data.repository.WebsiteRepository
import com.example.edacycours.ui.common.Coroutines

class WebsiteViewModel : ViewModel() {

    var websites: LiveData<List<Website>>? = null
        private set

    init {
        Coroutines.main {
            websites = WebsiteRepository.getWebsites()
        }
    }
}
