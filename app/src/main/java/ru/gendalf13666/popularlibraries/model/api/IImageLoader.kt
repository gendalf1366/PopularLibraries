package ru.gendalf13666.popularlibraries.model.api

interface IImageLoader<T> {
    fun loadIntro(url: String, container: T)
}
