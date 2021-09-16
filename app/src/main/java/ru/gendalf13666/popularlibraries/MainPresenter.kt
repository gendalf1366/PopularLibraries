package ru.gendalf13666.popularlibraries

class MainPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun counterClick(buttonCounterNumber: Numbers) {
        when (buttonCounterNumber) {
            Numbers.ONE -> view.setButton1Text(model.next(0).toString())
            Numbers.TWO -> view.setButton2Text(model.next(1).toString())
            Numbers.THREE -> view.setButton3Text(model.next(2).toString())
        }
    }
}
