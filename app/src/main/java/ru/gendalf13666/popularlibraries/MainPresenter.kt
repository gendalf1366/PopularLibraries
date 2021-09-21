package ru.gendalf13666.popularlibraries

class MainPresenter(private val view: MainView, private val model: CountersModel = CountersModel()) {

    fun counterClick(buttonCounterNumber: Numbers) {
        when (buttonCounterNumber) {
            Numbers.ONE -> view.showCounter1(model.next(0).toString())
            Numbers.TWO -> view.showCounter2(model.next(1).toString())
            Numbers.THREE -> view.showCounter3(model.next(2).toString())
        }
    }
}
