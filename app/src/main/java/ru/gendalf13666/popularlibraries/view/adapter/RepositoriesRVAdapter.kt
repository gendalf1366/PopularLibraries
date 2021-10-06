package ru.gendalf13666.popularlibraries.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.gendalf13666.popularlibraries.databinding.RecyclerViewItemRepoBinding
import ru.gendalf13666.popularlibraries.presenter.IRepoListPresenter
import ru.gendalf13666.popularlibraries.presenter.RepoItemView

class RepositoriesRVAdapter(val presenter: IRepoListPresenter) : RecyclerView.Adapter<RepositoriesRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            RecyclerViewItemRepoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        ).apply {
            itemView.setOnClickListener {
                presenter.itemClickListener?.invoke(this)
            }
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        presenter.bindView(holder.apply { pos = position })

    override fun getItemCount(): Int = presenter.getCount()

    inner class ViewHolder(private val vb: RecyclerViewItemRepoBinding) :
        RecyclerView.ViewHolder(vb.root),
        RepoItemView {
        override var pos: Int = -1

        override fun setName(name: String) = with(vb) {
            tvName.text = name
        }
    }
}
