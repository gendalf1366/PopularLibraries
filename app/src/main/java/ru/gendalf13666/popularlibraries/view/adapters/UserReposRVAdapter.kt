package ru.gendalf13666.popularlibraries.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gendalf13666.popularlibraries.databinding.ViewItemUserRepoBinding
import ru.gendalf13666.popularlibraries.presenter.IUserReposListPresenter
import ru.gendalf13666.popularlibraries.view.UserRepoItemView

class UserReposRVAdapter(private val presenter: IUserReposListPresenter) :
    RecyclerView.Adapter<UserReposRVAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ViewItemUserRepoBinding) :
        RecyclerView.ViewHolder(binding.root), UserRepoItemView {

        override fun setRepoName(repoName: String) {
            binding.tvRepoName.text = repoName
        }

        override var pos = -1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            ViewItemUserRepoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        ).apply {
            itemView.setOnClickListener {
                presenter.itemClickListener?.invoke(this)
            }
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        presenter.bindView(holder.apply { pos = position })

    override fun getItemCount() = presenter.getCount()
}
