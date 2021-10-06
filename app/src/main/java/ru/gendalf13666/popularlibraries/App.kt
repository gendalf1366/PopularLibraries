package ru.gendalf13666.popularlibraries

import android.app.Application
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import ru.gendalf13666.popularlibraries.model.room.Database

class App : Application() {
    companion object Navigation {
        private val cicerone: Cicerone<Router> by lazy {
            Cicerone.create()
        }
        val navigatorHolder = cicerone.getNavigatorHolder()
        val router = cicerone.router
    }

    override fun onCreate() {
        super.onCreate()
        Database.create(this)
    }
}
