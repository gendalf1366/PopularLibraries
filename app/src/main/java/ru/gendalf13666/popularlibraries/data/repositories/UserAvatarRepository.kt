package ru.gendalf13666.popularlibraries.data.repositories

import android.graphics.drawable.Drawable
import com.bumptech.glide.RequestBuilder
import ru.gendalf13666.popularlibraries.data.entity.GithubUser

interface UserAvatarRepository {

    fun imageBuilder(user: GithubUser): RequestBuilder<Drawable>
}
