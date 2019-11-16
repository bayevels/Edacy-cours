package com.example.edacycours.ui


import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import com.example.edacycours.ui.une.adapter.ArticleAdapter
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private  lateinit var mAdapter: ArticleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        initUI()
    }

    private fun initUI() {
        val articles = listOf(
            Article(1, "Premier article", "la description du premier article voir plus...", url="https://senego.com/wp-content/uploads/2019/11/8fb94b0e2a38c96a14c0a3da41cc0e7757a4b811-300x180.jpg"),
            Article(2, "Deuxiéme article", "la description du second article voir plus...", url="https://senego.com/wp-content/uploads/2019/11/8fb94b0e2a38c96a14c0a3da41cc0e7757a4b811-300x180.jpg"),
            Article(3, "Troisiéme article", "la description du dernier article voir plus...", url="https://senego.com/wp-content/uploads/2019/11/8fb94b0e2a38c96a14c0a3da41cc0e7757a4b811-300x180.jpg")
        )
        mAdapter = ArticleAdaparter(articles, ::onArticleItemClicked)

        recycler_view.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }

    fun onArticleItemClicked(article: Article) {

    }
}
