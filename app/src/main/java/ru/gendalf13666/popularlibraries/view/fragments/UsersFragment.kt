package ru.gendalf13666.popularlibraries.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.App
import ru.gendalf13666.popularlibraries.databinding.FragmentUsersBinding
import ru.gendalf13666.popularlibraries.model.RetrofitGithubUsersRepo
import ru.gendalf13666.popularlibraries.model.api.ApiHolder
import ru.gendalf13666.popularlibraries.model.api.GlideImageLoader
import ru.gendalf13666.popularlibraries.model.cache.GithubUsersCacheImpl
import ru.gendalf13666.popularlibraries.model.network.AndroidNetworkStatus
import ru.gendalf13666.popularlibraries.model.room.Database
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.UsersPresenter
import ru.gendalf13666.popularlibraries.view.UsersView
import ru.gendalf13666.popularlibraries.view.adapter.UsersRVAdapter

class UsersFragment : MvpAppCompatFragment(), UsersView, BackButtonListener {
    companion object {
        fun newInstance() = UsersFragment()
    }

    val database: Database by lazy {
        Database.apply { create(requireContext()) }.getInstance()
    }
    val presenter: UsersPresenter by moxyPresenter {
        UsersPresenter(
            RetrofitGithubUsersRepo(
                ApiHolder.api,
                AndroidNetworkStatus(requireContext()),
                GithubUsersCacheImpl(database)
            ),
            App.router,
            AndroidSchedulers.mainThread()
        )
    }
    private var adapter: UsersRVAdapter? = null
    private var vb: FragmentUsersBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentUsersBinding.inflate(inflater, container, false).also {
        vb = it
    }.root

    override fun onDestroyView() {
        vb = null
        adapter = null
        super.onDestroyView()
    }

    override fun init() {
        vb?.rvUsers?.layoutManager = LinearLayoutManager(context)
        adapter = UsersRVAdapter(presenter.usersListPresenter, GlideImageLoader())
        vb?.rvUsers?.adapter = adapter
    }

    override fun updateList() {
        adapter?.notifyDataSetChanged()
    }

    override fun backPressed() = presenter.backPressed()
}
