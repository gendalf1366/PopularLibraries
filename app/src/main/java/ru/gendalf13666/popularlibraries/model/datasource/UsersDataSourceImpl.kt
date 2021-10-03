package ru.gendalf13666.popularlibraries.model.datasource

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Single
import ru.gendalf13666.popularlibraries.model.api.GithubApi
import ru.gendalf13666.popularlibraries.model.entity.GithubUser
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo

class UsersDataSourceImpl(private val githubApi: GithubApi) : UsersDataSource {
    override fun getUsers(): Single<List<GithubUser>> = githubApi.getUsers()

    override fun getUserByLogin(login: String?): Maybe<GithubUser> {
        return if (login != null) {
            githubApi.getUserByLogin(login)
                .toMaybe()
        } else {
            Maybe.empty()
        }
    }

    override fun getUserRepos(url: String): Maybe<List<GithubUserRepo>> =
        githubApi.getUserRepos(url).toMaybe()
}
