package ru.gendalf13666.popularlibraries.presenter

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gendalf13666.popularlibraries.model.GitHubRepo
import ru.gendalf13666.popularlibraries.model.GithubUser
import ru.gendalf13666.popularlibraries.view.fragments.RepositoryFragment
import ru.gendalf13666.popularlibraries.view.fragments.UserFragment
import ru.gendalf13666.popularlibraries.view.fragments.UsersFragment

object AndroidScreens {
    class UsersScreen : IScreen {
        override fun getFragment(): Screen = FragmentScreen { UsersFragment.newInstance() }
    }

    class UserScreen(private val user: GithubUser) : IScreen {
        override fun getFragment(): Screen = FragmentScreen { UserFragment.newInstance(user) }
    }

    class RepositoryScreen(private val repo: GitHubRepo) : IScreen {
        override fun getFragment(): Screen = FragmentScreen { RepositoryFragment.newInstance(repo) }
    }
}
