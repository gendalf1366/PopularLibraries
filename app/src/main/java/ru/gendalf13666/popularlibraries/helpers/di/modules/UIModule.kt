package ru.gendalf13666.popularlibraries.helpers.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.gendalf13666.popularlibraries.baselogic.main.MainActivity
import ru.gendalf13666.popularlibraries.baselogic.user.UserFragment
import ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment
import ru.gendalf13666.popularlibraries.baselogic.users.UsersFragment

@Module
interface UIModule {

    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun bindUserFragment(): UserFragment

    @ContributesAndroidInjector
    fun bindUsersFragment(): UsersFragment

    @ContributesAndroidInjector
    fun bindRepositoryFragment(): RepositoryFragment
}
