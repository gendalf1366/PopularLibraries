package ru.gendalf13666.popularlibraries.view

interface UserItemView : IItemView {
    fun setLogin(text: String)
    fun loadAvatar(url: String)
}
