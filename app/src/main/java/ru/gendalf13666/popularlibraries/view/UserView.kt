package ru.gendalf13666.popularlibraries.view

import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo

@StateStrategyType(AddToEndSingleStrategy::class)
interface UserView : ScreenView {
    fun showUser(user: GithubUserViewModel)
    fun updateRepos()
    fun init()
    fun showRepo(repo: GithubUserRepo)
}
