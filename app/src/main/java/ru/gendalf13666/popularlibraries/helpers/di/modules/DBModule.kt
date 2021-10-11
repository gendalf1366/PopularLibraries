package ru.gendalf13666.popularlibraries.helpers.di.modules

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import ru.gendalf13666.popularlibraries.data.db.AppDB
import ru.gendalf13666.popularlibraries.helpers.di.AppDataBase
import javax.inject.Singleton

@Module
class DBModule {

    @AppDataBase
    @Singleton
    @Provides
    fun provideAppDB(context: Context): AppDB =
        Room.databaseBuilder(context, AppDB::class.java, AppDB.DB_NAME)
            .build()
}
