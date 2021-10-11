package ru.gendalf13666.popularlibraries.baselogic.users;

import java.lang.Override;
import java.lang.Throwable;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SingleStateStrategy;

public class UsersView$$State extends MvpViewState<UsersView> implements UsersView {
	@Override
	public void init() {
		InitCommand initCommand = new InitCommand();
		this.viewCommands.beforeApply(initCommand);

		if (hasNotView()) {
			return;
		}

		for (UsersView view : this.views) {
			view.init();
		}

		this.viewCommands.afterApply(initCommand);
	}

	@Override
	public void updateList() {
		UpdateListCommand updateListCommand = new UpdateListCommand();
		this.viewCommands.beforeApply(updateListCommand);

		if (hasNotView()) {
			return;
		}

		for (UsersView view : this.views) {
			view.updateList();
		}

		this.viewCommands.afterApply(updateListCommand);
	}

	@Override
	public void showException(Throwable throwable) {
		ShowExceptionCommand showExceptionCommand = new ShowExceptionCommand(throwable);
		this.viewCommands.beforeApply(showExceptionCommand);

		if (hasNotView()) {
			return;
		}

		for (UsersView view : this.views) {
			view.showException(throwable);
		}

		this.viewCommands.afterApply(showExceptionCommand);
	}

	public class InitCommand extends ViewCommand<UsersView> {
		InitCommand() {
			super("init", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(UsersView mvpView) {
			mvpView.init();
		}
	}

	public class UpdateListCommand extends ViewCommand<UsersView> {
		UpdateListCommand() {
			super("updateList", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(UsersView mvpView) {
			mvpView.updateList();
		}
	}

	public class ShowExceptionCommand extends ViewCommand<UsersView> {
		public final Throwable throwable;

		ShowExceptionCommand(Throwable throwable) {
			super("showException", SingleStateStrategy.class);

			this.throwable = throwable;
		}

		@Override
		public void apply(UsersView mvpView) {
			mvpView.showException(throwable);
		}
	}
}
