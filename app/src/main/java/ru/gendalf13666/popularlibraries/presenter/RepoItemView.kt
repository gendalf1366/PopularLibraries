package ru.gendalf13666.popularlibraries.presenter

import ru.gendalf13666.popularlibraries.view.IItemView

interface RepoItemView : IItemView {
    fun setName(name: String)
}
