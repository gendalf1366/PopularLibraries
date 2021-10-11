package ru.gendalf13666.popularlibraries.baselogic;

import java.lang.Override;
import moxy.MvpView;
import moxy.MvpView$$State;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

public class BasePresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new MvpView$$State();
	}
}
