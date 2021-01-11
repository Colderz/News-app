package pakiet.arkadiuszzimny.newsapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pakiet.arkadiuszzimny.newsapp.models.Article

@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {

    abstract fun getArticleDao() : ArticleDAO

    companion object {
        //to znaczy, że inne wątki od razu widzą zmiany
        @Volatile
        private var instance: ArticleDatabase? = null
        //używamy tego, aby upewnić się, że bedzie tylko jedna instancja
        private val LOCK = Any()

        //coś jak konstruktor, wywoływany przy tworzeniu obiektu
        //jeśli instancja to null - wykonujemy synchronized, a w nim tworzymy tę bazę
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabse(context).also {instance = it}
        }

        private fun createDatabse(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).build()
    }


}