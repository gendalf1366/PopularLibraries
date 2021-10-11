package ru.gendalf13666.popularlibraries

import com.github.terrakok.cicerone.Cicerone
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.gendalf13666.popularlibraries.helpers.di.DaggerAppComponent
import ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulersImpl

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<App> =
        DaggerAppComponent
            .builder()
            .apply {
                withContext(applicationContext)

                val cicerone = Cicerone.create()
                withNavigationHolder(cicerone.getNavigatorHolder())
                withRouter(cicerone.router)
                withAppScheduler(AppSchedulersImpl())
            }
            .build()
}
