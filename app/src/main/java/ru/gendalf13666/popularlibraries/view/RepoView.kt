package ru.gendalf13666.popularlibraries.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface RepoView : MvpView {
    fun init()
    fun setId(id: String)
    fun setTitle(title: String)
    fun setForksCount(forksCount: String)
}
