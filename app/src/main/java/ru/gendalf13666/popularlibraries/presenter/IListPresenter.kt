package ru.gendalf13666.popularlibraries.presenter

import ru.gendalf13666.popularlibraries.view.IItemView
import ru.gendalf13666.popularlibraries.view.UserItemView

interface IListPresenter<V : IItemView> {
    var itemClickListener: ((V) -> Unit)?
    fun bindView(view: V)
    fun getCount(): Int
}

interface IUserListPresenter : IListPresenter<UserItemView>
