package ru.gendalf13666.popularlibraries.view

import android.annotation.SuppressLint
import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.App.Navigation.router
import ru.gendalf13666.popularlibraries.R
import ru.gendalf13666.popularlibraries.databinding.FragmentUsersBinding
import ru.gendalf13666.popularlibraries.model.repo.GithubUsersRepoFactory
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.UsersPresenter
import ru.gendalf13666.popularlibraries.view.adapters.UsersRVAdapter

class UsersFragment : MvpAppCompatFragment(R.layout.fragment_users), UsersView, BackButtonListener {

    companion object {
        fun newInstance() = UsersFragment()
    }

    private val binding: FragmentUsersBinding by viewBinding()
    private val presenter by moxyPresenter {
        UsersPresenter(
            GithubUsersRepoFactory.create(),
            router
        )
    }
    private var adapter: UsersRVAdapter? = null

    override fun init() {
        adapter = UsersRVAdapter(presenter.usersListPresenter)
        binding.rvUsers.adapter = adapter
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun updateList() {
        adapter?.notifyDataSetChanged()
    }

    override fun showToast(message: String) {
        Toast.makeText(requireActivity(), message, Toast.LENGTH_LONG).show()
    }

    override fun backPressed() = presenter.backPressed()
}
