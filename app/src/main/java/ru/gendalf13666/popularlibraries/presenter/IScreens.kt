package ru.gendalf13666.popularlibraries.presenter

import com.github.terrakok.cicerone.Screen
import ru.gendalf13666.popularlibraries.model.GithubUser

interface IScreens {
    fun users(): Screen
    fun user(user: GithubUser): Screen
}
