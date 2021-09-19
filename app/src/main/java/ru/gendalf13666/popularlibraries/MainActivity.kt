package ru.gendalf13666.popularlibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gendalf13666.popularlibraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setButtonClickListener()
    }

    private fun setButtonClickListener() {
        binding.buttonCounter1.setOnClickListener {
            presenter.counterClick(Numbers.ONE)
        }
        binding.buttonCounter2.setOnClickListener {
            presenter.counterClick(Numbers.TWO)
        }
        binding.buttonCounter3.setOnClickListener {
            presenter.counterClick(Numbers.THREE)
        }
    }

    override fun showCounter1(counter: String) {
        binding.buttonCounter1.text = counter
    }

    override fun showCounter2(counter: String) {
        binding.buttonCounter2.text = counter
    }

    override fun showCounter3(counter: String) {
        binding.buttonCounter3.text = counter
    }
}
