package pakiet.arkadiuszzimny.newsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import pakiet.arkadiuszzimny.newsapp.models.Article

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    //update and insert
    suspend fun upsert(article: Article): Long


    //Nie będzie suspend, bo zwraca obkiety LiveData
    @Query("SELECT * FROM articles")
    fun getAllArticles() : LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}