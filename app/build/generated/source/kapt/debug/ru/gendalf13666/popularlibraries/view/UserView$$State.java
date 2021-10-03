package ru.gendalf13666.popularlibraries.view;

import java.lang.Override;
import java.lang.String;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import ru.gendalf13666.popularlibraries.model.entity.GithubUserRepo;

public class UserView$$State extends MvpViewState<UserView> implements UserView {
	@Override
	public void showUser(GithubUserViewModel arg0) {
		ShowUserCommand showUserCommand = new ShowUserCommand(arg0);
		this.viewCommands.beforeApply(showUserCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.showUser(arg0);
		}

		this.viewCommands.afterApply(showUserCommand);
	}

	@Override
	public void updateRepos() {
		UpdateReposCommand updateReposCommand = new UpdateReposCommand();
		this.viewCommands.beforeApply(updateReposCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.updateRepos();
		}

		this.viewCommands.afterApply(updateReposCommand);
	}

	@Override
	public void init() {
		InitCommand initCommand = new InitCommand();
		this.viewCommands.beforeApply(initCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.init();
		}

		this.viewCommands.afterApply(initCommand);
	}

	@Override
	public void showRepo(GithubUserRepo arg0) {
		ShowRepoCommand showRepoCommand = new ShowRepoCommand(arg0);
		this.viewCommands.beforeApply(showRepoCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.showRepo(arg0);
		}

		this.viewCommands.afterApply(showRepoCommand);
	}

	@Override
	public void showToast(String arg0) {
		ShowToastCommand showToastCommand = new ShowToastCommand(arg0);
		this.viewCommands.beforeApply(showToastCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.showToast(arg0);
		}

		this.viewCommands.afterApply(showToastCommand);
	}

	public class ShowUserCommand extends ViewCommand<UserView> {
		public final GithubUserViewModel arg0;

		ShowUserCommand(GithubUserViewModel arg0) {
			super("showUser", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.showUser(arg0);
		}
	}

	public class UpdateReposCommand extends ViewCommand<UserView> {
		UpdateReposCommand() {
			super("updateRepos", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.updateRepos();
		}
	}

	public class InitCommand extends ViewCommand<UserView> {
		InitCommand() {
			super("init", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.init();
		}
	}

	public class ShowRepoCommand extends ViewCommand<UserView> {
		public final GithubUserRepo arg0;

		ShowRepoCommand(GithubUserRepo arg0) {
			super("showRepo", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.showRepo(arg0);
		}
	}

	public class ShowToastCommand extends ViewCommand<UserView> {
		public final String arg0;

		ShowToastCommand(String arg0) {
			super("showToast", AddToEndSingleStrategy.class);

			this.arg0 = arg0;
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.showToast(arg0);
		}
	}
}
