package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import java.lang.Override;
import java.lang.String;
import java.lang.Throwable;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.SingleStateStrategy;

public class RepositoryView$$State extends MvpViewState<RepositoryView> implements RepositoryView {
	@Override
	public void showInfo(String text) {
		ShowInfoCommand showInfoCommand = new ShowInfoCommand(text);
		this.viewCommands.beforeApply(showInfoCommand);

		if (hasNotView()) {
			return;
		}

		for (RepositoryView view : this.views) {
			view.showInfo(text);
		}

		this.viewCommands.afterApply(showInfoCommand);
	}

	@Override
	public void showException(Throwable throwable) {
		ShowExceptionCommand showExceptionCommand = new ShowExceptionCommand(throwable);
		this.viewCommands.beforeApply(showExceptionCommand);

		if (hasNotView()) {
			return;
		}

		for (RepositoryView view : this.views) {
			view.showException(throwable);
		}

		this.viewCommands.afterApply(showExceptionCommand);
	}

	public class ShowInfoCommand extends ViewCommand<RepositoryView> {
		public final String text;

		ShowInfoCommand(String text) {
			super("showInfo", SingleStateStrategy.class);

			this.text = text;
		}

		@Override
		public void apply(RepositoryView mvpView) {
			mvpView.showInfo(text);
		}
	}

	public class ShowExceptionCommand extends ViewCommand<RepositoryView> {
		public final Throwable throwable;

		ShowExceptionCommand(Throwable throwable) {
			super("showException", SingleStateStrategy.class);

			this.throwable = throwable;
		}

		@Override
		public void apply(RepositoryView mvpView) {
			mvpView.showException(throwable);
		}
	}
}
