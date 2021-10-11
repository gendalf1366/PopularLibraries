package ru.gendalf13666.popularlibraries.baselogic.main

import android.os.Bundle
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import moxy.ktx.moxyPresenter
import ru.gendalf13666.popularlibraries.R
import ru.gendalf13666.popularlibraries.baselogic.BackButtonListener
import ru.gendalf13666.popularlibraries.databinding.MainActivityBinding
import ru.gendalf13666.popularlibraries.helpers.di.BaseDaggerActivity
import javax.inject.Inject

class MainActivity : BaseDaggerActivity(), MainView {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router

    private val binding: MainActivityBinding by viewBinding(createMethod = CreateMethod.INFLATE)
    private val presenter by moxyPresenter { MainPresenter(router) }
    private val navigator = AppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        presenter.execExampleMap()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }

    override fun onBackPressed() {
        supportFragmentManager.fragments.forEach {
            if (it is BackButtonListener && it.backPressed()) {
                return
            }
        }
        presenter.backPressed()
    }
}
