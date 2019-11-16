package com.example.edacycours.ui.une

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import com.example.edacycours.ui.une.adapter.ArticleAdapter

class UneFragment : Fragment() {

    companion object {
        fun newInstance() = UneFragment()
    }

    private lateinit var viewModel: UneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.une_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UneViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
