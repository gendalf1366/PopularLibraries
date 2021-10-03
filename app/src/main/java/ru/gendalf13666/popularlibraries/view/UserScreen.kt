package ru.gendalf13666.popularlibraries.view

import com.github.terrakok.cicerone.androidx.FragmentScreen

class UserScreen(private val login: String) {
    fun create() = FragmentScreen { UserFragment.newInstance(login) }
}
