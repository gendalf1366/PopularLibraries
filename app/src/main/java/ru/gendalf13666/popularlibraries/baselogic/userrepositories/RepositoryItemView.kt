package ru.gendalf13666.popularlibraries.baselogic.userrepositories

interface RepositoryItemView {
    var currentPosition: Int

    fun setName(text: String)
}
