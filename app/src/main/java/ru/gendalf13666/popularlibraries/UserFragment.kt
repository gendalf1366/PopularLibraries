package ru.gendalf13666.popularlibraries

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.databinding.FragmentUserBinding
import ru.gendalf13666.popularlibraries.model.GithubUser
import ru.gendalf13666.popularlibraries.presenter.BackButtonListener
import ru.gendalf13666.popularlibraries.presenter.UserPresenter
import ru.gendalf13666.popularlibraries.view.UserView

class UserFragment : MvpAppCompatFragment(R.layout.fragment_user), UserView, BackButtonListener {

    private val vb: FragmentUserBinding by viewBinding()

    private val presenter: UserPresenter by moxyPresenter {
        val user = arguments?.getParcelable<GithubUser>(USER) as GithubUser
        UserPresenter(App.router, user)
    }

    override fun setLogin(text: String) {
        vb.userLoginText.text = text
    }

    override fun backPressed() = presenter.backPressed()

    companion object {
        private const val USER = "USER"
        fun newInstance(user: GithubUser): Fragment =
            UserFragment().apply {
                arguments = bundleOf().apply {
                    putParcelable(USER, user)
                }
            }
    }
}
