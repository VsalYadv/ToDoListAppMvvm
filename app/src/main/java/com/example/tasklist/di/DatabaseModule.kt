import android.content.Context
import com.example.tasklist.data.ToDoDao
import com.example.tasklist.data.ToDoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(appContext: Context): ToDoDatabase {
        return ToDoDatabase.getDatabase(appContext)
    }

    @Provides
    fun provideToDoDao(database: ToDoDatabase): ToDoDao {
        return database.toDoDao()
    }
}
