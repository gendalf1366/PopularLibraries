package ru.gendalf13666.popularlibraries.model.api

import okhttp3.Interceptor
import okhttp3.Response
import ru.gendalf13666.popularlibraries.BuildConfig

object GithubApiInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(
            chain.request()
                .newBuilder()
                .header("Authorization", BuildConfig.GITHUB_DB_APIKEY)
                .build()
        )
}
