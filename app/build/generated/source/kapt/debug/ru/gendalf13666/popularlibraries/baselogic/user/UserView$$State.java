package ru.gendalf13666.popularlibraries.baselogic.user;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.RequestBuilder;
import java.lang.Override;
import java.lang.Throwable;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.SingleStateStrategy;
import ru.gendalf13666.popularlibraries.data.entity.GithubUser;

public class UserView$$State extends MvpViewState<UserView> implements UserView {
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
	public void showUser(GithubUser user, RequestBuilder<Drawable> requestBuilder) {
		ShowUserCommand showUserCommand = new ShowUserCommand(user, requestBuilder);
		this.viewCommands.beforeApply(showUserCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.showUser(user, requestBuilder);
		}

		this.viewCommands.afterApply(showUserCommand);
	}

	@Override
	public void updateRepositoryList() {
		UpdateRepositoryListCommand updateRepositoryListCommand = new UpdateRepositoryListCommand();
		this.viewCommands.beforeApply(updateRepositoryListCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.updateRepositoryList();
		}

		this.viewCommands.afterApply(updateRepositoryListCommand);
	}

	@Override
	public void showException(Throwable throwable) {
		ShowExceptionCommand showExceptionCommand = new ShowExceptionCommand(throwable);
		this.viewCommands.beforeApply(showExceptionCommand);

		if (hasNotView()) {
			return;
		}

		for (UserView view : this.views) {
			view.showException(throwable);
		}

		this.viewCommands.afterApply(showExceptionCommand);
	}

	public class InitCommand extends ViewCommand<UserView> {
		InitCommand() {
			super("init", SingleStateStrategy.class);
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.init();
		}
	}

	public class ShowUserCommand extends ViewCommand<UserView> {
		public final GithubUser user;

		public final RequestBuilder<Drawable> requestBuilder;

		ShowUserCommand(GithubUser user, RequestBuilder<Drawable> requestBuilder) {
			super("showUser", SingleStateStrategy.class);

			this.user = user;
			this.requestBuilder = requestBuilder;
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.showUser(user, requestBuilder);
		}
	}

	public class UpdateRepositoryListCommand extends ViewCommand<UserView> {
		UpdateRepositoryListCommand() {
			super("updateRepositoryList", SingleStateStrategy.class);
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.updateRepositoryList();
		}
	}

	public class ShowExceptionCommand extends ViewCommand<UserView> {
		public final Throwable throwable;

		ShowExceptionCommand(Throwable throwable) {
			super("showException", SingleStateStrategy.class);

			this.throwable = throwable;
		}

		@Override
		public void apply(UserView mvpView) {
			mvpView.showException(throwable);
		}
	}
}
