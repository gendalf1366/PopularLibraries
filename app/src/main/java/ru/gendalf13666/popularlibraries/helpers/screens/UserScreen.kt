package ru.gendalf13666.popularlibraries.helpers.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gendalf13666.popularlibraries.baselogic.user.UserFragment

class UserScreen(private val userLogin: String) : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment = UserFragment.newInstance(userLogin)
}
