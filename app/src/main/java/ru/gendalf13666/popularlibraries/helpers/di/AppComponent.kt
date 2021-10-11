package ru.gendalf13666.popularlibraries.helpers.di

import android.content.Context
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import ru.gendalf13666.popularlibraries.App
import ru.gendalf13666.popularlibraries.helpers.di.modules.ApiModule
import ru.gendalf13666.popularlibraries.helpers.di.modules.DBModule
import ru.gendalf13666.popularlibraries.helpers.di.modules.UIModule
import ru.gendalf13666.popularlibraries.helpers.di.modules.UserModule
import ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        UserModule::class,
        ApiModule::class,
        DBModule::class,
        UIModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withContext(context: Context): Builder

        @BindsInstance
        fun withRouter(router: Router): Builder

        @BindsInstance
        fun withNavigationHolder(navigatorHolder: NavigatorHolder): Builder

        @BindsInstance
        fun withAppScheduler(appSchedulers: AppSchedulers): Builder

        fun build(): AppComponent
    }
}
