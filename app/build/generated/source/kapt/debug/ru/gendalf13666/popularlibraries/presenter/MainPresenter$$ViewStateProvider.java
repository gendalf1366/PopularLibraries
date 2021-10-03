package ru.gendalf13666.popularlibraries.presenter;

import java.lang.Override;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;
import ru.gendalf13666.popularlibraries.view.MainView$$State;

public class MainPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new MainView$$State();
	}
}
