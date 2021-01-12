package pakiet.arkadiuszzimny.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import pakiet.arkadiuszzimny.newsapp.R
import pakiet.arkadiuszzimny.newsapp.ui.NewsActivity
import pakiet.arkadiuszzimny.newsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}