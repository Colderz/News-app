package pakiet.arkadiuszzimny.newsapp.models

import pakiet.arkadiuszzimny.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)