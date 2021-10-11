package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import java.lang.Override;
import moxy.MvpView;
import moxy.ViewStateProvider;
import moxy.viewstate.MvpViewState;

public class RepositoryPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new RepositoryView$$State();
	}
}
