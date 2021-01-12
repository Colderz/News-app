package pakiet.arkadiuszzimny.newsapp.repository

import pakiet.arkadiuszzimny.newsapp.api.RetrofitInstance
import pakiet.arkadiuszzimny.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}