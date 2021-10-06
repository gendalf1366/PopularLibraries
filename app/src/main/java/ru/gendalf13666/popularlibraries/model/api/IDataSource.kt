package ru.gendalf13666.popularlibraries.model.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Url
import ru.gendalf13666.popularlibraries.model.GitHubRepo
import ru.gendalf13666.popularlibraries.model.GithubUser

interface IDataSource {
    @GET("/users")
    fun getUsers(): Single<List<GithubUser>>

    @GET
    fun getRepo(@Url url: String): Single<List<GitHubRepo>>
}
