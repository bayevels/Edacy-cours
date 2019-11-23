package com.example.edacycours.ui


import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import com.example.edacycours.ui.common.toast
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
            Article(1, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html","https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png"),
            Article(2, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html", "https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png"),
            Article(3, "Boughazély en garde à vue à la section de recherches", "Le député Seydina Fall alias « Boughazély » est en garde à vue à la section de recherches de la gendarmerie de Colobane....", "https://senego.com/boughazely-en-garde-a-vue-a-la-section-de-recherches_1004270.html", "https://senego.com/wp-content/uploads/2019/11/garde.jpg", "https://senego.com/wp-content/themes/senegoV11/images/logo-1.png")
        )
        mAdapter = ArticleAdapter(articles, ::onArticleItemClicked)

        recycler_view.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }

    fun onArticleItemClicked(article: Article) {
        val action = MainFragmentDirections.actionActionMainToActionWebClient(article)
        findNavController().navigate(action)
    }
}
