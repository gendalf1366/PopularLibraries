package ru.gendalf13666.popularlibraries.helpers.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment

class RepositoryScreen(
    private val userLogin: String,
    private val repositoryName: String
) : FragmentScreen {

    override fun createFragment(factory: FragmentFactory): Fragment = RepositoryFragment.newInstance(userLogin, repositoryName)
}
