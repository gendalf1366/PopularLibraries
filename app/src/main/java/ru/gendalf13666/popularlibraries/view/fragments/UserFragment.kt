package ru.gendalf13666.popularlibraries.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.App
import ru.gendalf13666.popularlibraries.databinding.FragmentUserBinding
import ru.gendalf13666.popularlibraries.model.GithubUser
import ru.gendalf13666.popularlibraries.model.RetrofitGithubRepositoriesRepo
import ru.gendalf13666.popularlibraries.model.api.ApiHolder
import ru.gendalf13666.popularlibraries.model.cache.GithubReposCacheImpl
import ru.gendalf13666.popularlibraries.model.network.AndroidNetworkStatus
import ru.gendalf13666.popularlibraries.model.room.Database
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.UserPresenter
import ru.gendalf13666.popularlibraries.view.UserView
import ru.gendalf13666.popularlibraries.view.adapter.RepositoriesRVAdapter

class UserFragment : MvpAppCompatFragment(), UserView, BackButtonListener {

    private val database: Database by lazy {
        Database.apply { create(requireContext()) }.getInstance()
    }
    private var vb: FragmentUserBinding? = null
    private var adapter: RepositoriesRVAdapter? = null
    val presenter: UserPresenter by moxyPresenter {
        val user = arguments?.getParcelable<GithubUser>(USER) as GithubUser
        UserPresenter(
            App.router,
            user,
            RetrofitGithubRepositoriesRepo(
                ApiHolder.api,
                AndroidNetworkStatus(requireContext()),
                GithubReposCacheImpl(database)
            ),
            AndroidSchedulers.mainThread()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentUserBinding.inflate(inflater, container, false).also {
        vb = it
    }.root

    override fun init() {
        vb?.rvRepos?.layoutManager = LinearLayoutManager(context)
        adapter = RepositoriesRVAdapter(presenter.reposListPresenter)
        vb?.rvRepos?.adapter = adapter
    }

    override fun setLogin(text: String) {
        vb?.userLoginText?.text = text
    }

    override fun updateList() {
        adapter?.notifyDataSetChanged()
    }

    override fun backPressed() = presenter.backPressed()

    override fun onDestroyView() {
        vb = null
        adapter = null
        super.onDestroyView()
    }

    companion object {
        private const val USER = "USER"
        fun newInstance(user: GithubUser) =
            UserFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(USER, user)
                }
            }
    }
}
