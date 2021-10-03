package ru.gendalf13666.popularlibraries.view;

import java.lang.Override;
import java.lang.String;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;

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
	public void showToast(String arg0) {
		ShowToastCommand showToastCommand = new ShowToastCommand(arg0);
		this.viewCommands.beforeApply(showToastCommand);

		if (hasNotView()) {
			return;
		}

		for (UsersView view : this.views) {
			view.showToast(arg0);
		}

		this.viewCommands.afterApply(showToastCommand);
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

	public class ShowToastCommand extends ViewCommand<UsersView> {
		public final String arg0;

		ShowToastCommand(String arg0) {
			super("showToast", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(UsersView mvpView) {
			mvpView.showToast(arg0);
		}
	}
}
