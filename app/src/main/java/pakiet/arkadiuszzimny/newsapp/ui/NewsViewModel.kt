package pakiet.arkadiuszzimny.newsapp.ui

import androidx.lifecycle.ViewModel
import pakiet.arkadiuszzimny.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}