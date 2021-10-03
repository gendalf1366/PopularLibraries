package ru.gendalf13666.popularlibraries.view

interface UserItemView : IItemView {
    fun setUser(login: String, avatar_url: String)
}
