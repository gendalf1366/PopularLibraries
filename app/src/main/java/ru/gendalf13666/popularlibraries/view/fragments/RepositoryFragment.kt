package ru.gendalf13666.popularlibraries.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.App
import ru.gendalf13666.popularlibraries.databinding.FragmentRepositoryBinding
import ru.gendalf13666.popularlibraries.model.GitHubRepo
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.RepoPresenter
import ru.gendalf13666.popularlibraries.view.RepoView

class RepositoryFragment : MvpAppCompatFragment(), RepoView, BackButtonListener {

    private var vb: FragmentRepositoryBinding? = null
    val presenter: RepoPresenter by moxyPresenter {
        val repo = arguments?.getParcelable<GitHubRepo>(REPO) as GitHubRepo
        RepoPresenter(App.router, repo)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        FragmentRepositoryBinding.inflate(inflater, container, false).also {
            vb = it
        }.root

    companion object {
        private const val REPO = "repository"
        @JvmStatic
        fun newInstance(repo: GitHubRepo) = RepositoryFragment().apply {
            arguments = Bundle().apply {
                putParcelable(REPO, repo)
            }
        }
    }

    override fun init() {}

    override fun setId(id: String) {
        val idText = "id: $id"
        vb?.idTv?.text = idText
    }

    override fun setTitle(title: String) {
        val nameText = "Name: $title"
        vb?.titleTv?.text = nameText
    }

    override fun setForksCount(forksCount: String) {
        val forksText = "Forks Count: $forksCount"
        vb?.countForksTv?.text = forksText
    }

    override fun backPressed(): Boolean = presenter.backPressed()

    override fun onDestroyView() {
        vb = null
        super.onDestroyView()
    }
}
