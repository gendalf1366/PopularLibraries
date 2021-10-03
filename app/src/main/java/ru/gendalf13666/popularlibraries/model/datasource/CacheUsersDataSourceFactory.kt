package ru.gendalf13666.popularlibraries.model.datasource

object CacheUsersDataSourceFactory {
    fun create(): CacheUsersDataSource = CacheUsersDataSourceImpl()
}
