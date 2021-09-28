package ru.gendalf13666.popularlibraries

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gendalf13666.popularlibraries.model.GithubUser

class UserScreen(private val user: GithubUser) : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment =
        UserFragment.newInstance(user)
}
