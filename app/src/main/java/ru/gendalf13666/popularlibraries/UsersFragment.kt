package ru.gendalf13666.popularlibraries

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.adapter.UsersRVAdapter
import ru.gendalf13666.popularlibraries.databinding.FragmentUsersBinding
import ru.gendalf13666.popularlibraries.model.GithubUsersRepo
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.UsersPresenter
import ru.gendalf13666.popularlibraries.view.UsersView

class UsersFragment : MvpAppCompatFragment(R.layout.fragment_users), UsersView, BackButtonListener {

    companion object {
        fun newInstance(): Fragment = UsersFragment()
    }

    private val presenter: UsersPresenter by moxyPresenter {
        UsersPresenter(GithubUsersRepo(), App.router, AndroidScreens())
    }
    private var adapter: UsersRVAdapter? = null

    private val vb: FragmentUsersBinding by viewBinding()

    override fun init() {
        vb.rvUsers.layoutManager = LinearLayoutManager(context)
        adapter = UsersRVAdapter(presenter.usersListPresenter)
        vb.rvUsers.adapter = adapter
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun updateList() {
        adapter?.notifyDataSetChanged()
    }

    override fun backPressed() = presenter.backPressed()
}
