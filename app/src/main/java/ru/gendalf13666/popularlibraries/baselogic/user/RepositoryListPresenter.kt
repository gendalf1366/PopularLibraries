package ru.gendalf13666.popularlibraries.baselogic.user

import ru.gendalf13666.popularlibraries.baselogic.ListPresenter
import ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryItemView
import ru.gendalf13666.popularlibraries.data.entity.GithubUserRepository

class RepositoryListPresenter : ListPresenter<RepositoryItemView> {
    val repositories = mutableListOf<GithubUserRepository>()

    override var itemClickListener: ((RepositoryItemView) -> Unit)? = null

    override fun getCount() = repositories.size

    override fun bindView(view: RepositoryItemView) {
        val repository = repositories[view.currentPosition]
        view.setName(repository.fullName)
    }
}
