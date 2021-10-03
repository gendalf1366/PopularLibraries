package ru.gendalf13666.popularlibraries.presenter;

import java.lang.Override;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;
import ru.gendalf13666.popularlibraries.view.UsersView$$State;

public class UsersPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new UsersView$$State();
	}
}
