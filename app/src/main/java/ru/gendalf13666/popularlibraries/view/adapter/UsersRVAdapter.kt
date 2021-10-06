package ru.gendalf13666.popularlibraries.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.gendalf13666.popularlibraries.databinding.RecyclerViewItemBinding
import ru.gendalf13666.popularlibraries.model.api.IImageLoader
import ru.gendalf13666.popularlibraries.presenter.IUserListPresenter
import ru.gendalf13666.popularlibraries.view.UserItemView

class UsersRVAdapter(
    val presenter: IUserListPresenter,
    val imageLoader: IImageLoader<ImageView>
) : RecyclerView.Adapter<UsersRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        ).apply {
            itemView.setOnClickListener { presenter.itemClickListener?.invoke(this) }
        }

    override fun getItemCount() = presenter.getCount()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        presenter.bindView(holder.apply { pos = position })

    inner class ViewHolder(private val vb: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(vb.root),
        UserItemView {
        override var pos = -1

        override fun setLogin(text: String) = with(vb) {
            tvLogin.text = text
        }

        override fun loadAvatar(url: String) {
            imageLoader.loadIntro(url, vb.imageAvatar)
        }
    }
}
