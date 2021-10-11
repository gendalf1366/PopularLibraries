package ru.gendalf13666.popularlibraries.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import ru.gendalf13666.popularlibraries.data.entity.GithubUser
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository

interface GithubApi {

    @GET("users")
    fun getUsers(): Single<List<GithubUser>>

    @GET("users/{login}")
    fun getUser(@Path("login") login: String): Single<GithubUser>

    @GET("users/{login}/repos")
    fun getRepositories(@Path("login") login: String): Single<List<GithubUserRepository>>

    @GET("repos/{login}/{repository}")
    fun getRepository(
        @Path("login") login: String,
        @Path("repository") repository: String,
    ): Single<GithubUserRepository>
}
