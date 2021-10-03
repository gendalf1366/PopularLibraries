package ru.gendalf13666.popularlibraries.view

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.R
import ru.gendalf13666.popularlibraries.databinding.FragmentUserBinding
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo
import ru.gendalf13666.popularlibraries.model.repo.GithubUsersRepoFactory
import ru.gendalf13666.popularlibraries.presenter.UserPresenter
import ru.gendalf13666.popularlibraries.view.adapters.UserReposRVAdapter

class UserFragment : MvpAppCompatFragment(R.layout.fragment_user), UserView {

    companion object {
        private const val GITHUB_USER_LOGIN_KEY = "github_user_login_key"

        fun newInstance(login: String): Fragment =
            UserFragment().apply { arguments = bundleOf(GITHUB_USER_LOGIN_KEY to login) }
    }

    private val binding: FragmentUserBinding by viewBinding()
    private var reposAdapter: UserReposRVAdapter? = null
    private val presenter by moxyPresenter {
        UserPresenter(
            arguments?.getString(GITHUB_USER_LOGIN_KEY), GithubUsersRepoFactory.create()
        )
    }

    override fun showUser(user: GithubUserViewModel) {
        binding.apply {
            tvLogin.text = user.login
            tvLogin.setStartDrawableCircleImageFromUri(user.avatar_url)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun updateRepos() {
        reposAdapter?.notifyDataSetChanged()
    }

    override fun init() {
        val repos = binding.userRepos
        reposAdapter = UserReposRVAdapter(presenter.reposPresenter)
        repos.apply {
            adapter = reposAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun showRepo(repo: GithubUserRepo) {
        AlertDialog.Builder(requireActivity())
            .setTitle("Repository info")
            .setMessage("Forks count: ${repo.forkCount}")
            .setPositiveButton("Ok") { dialog, _ -> dialog?.cancel() }
            .create()
            .show()
    }

    override fun showToast(message: String) {
        Toast.makeText(requireActivity(), message, Toast.LENGTH_LONG).show()
    }
}
