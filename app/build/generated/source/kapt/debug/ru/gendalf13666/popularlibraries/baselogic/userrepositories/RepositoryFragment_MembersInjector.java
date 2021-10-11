// Generated by Dagger (https://dagger.dev).
package ru.gendalf13666.popularlibraries.baselogic.userrepositories;

import com.github.terrakok.cicerone.Router;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import ru.gendalf13666.popularlibraries.data.repositories.GithubUsersRepository;
import ru.gendalf13666.popularlibraries.helpers.di.BaseDaggerFragment_MembersInjector;
import ru.gendalf13666.popularlibraries.helpers.schedules.AppSchedulers;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryFragment_MembersInjector implements MembersInjector<RepositoryFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<Router> routerProvider;

  private final Provider<AppSchedulers> appSchedulersProvider;

  private final Provider<GithubUsersRepository> githubUsersRepositoryProvider;

  public RepositoryFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Router> routerProvider, Provider<AppSchedulers> appSchedulersProvider,
      Provider<GithubUsersRepository> githubUsersRepositoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.routerProvider = routerProvider;
    this.appSchedulersProvider = appSchedulersProvider;
    this.githubUsersRepositoryProvider = githubUsersRepositoryProvider;
  }

  public static MembersInjector<RepositoryFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<Router> routerProvider, Provider<AppSchedulers> appSchedulersProvider,
      Provider<GithubUsersRepository> githubUsersRepositoryProvider) {
    return new RepositoryFragment_MembersInjector(androidInjectorProvider, routerProvider, appSchedulersProvider, githubUsersRepositoryProvider);
  }

  @Override
  public void injectMembers(RepositoryFragment instance) {
    BaseDaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectRouter(instance, routerProvider.get());
    injectAppSchedulers(instance, appSchedulersProvider.get());
    injectGithubUsersRepository(instance, githubUsersRepositoryProvider.get());
  }

  @InjectedFieldSignature("ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment.router")
  public static void injectRouter(RepositoryFragment instance, Router router) {
    instance.router = router;
  }

  @InjectedFieldSignature("ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment.appSchedulers")
  public static void injectAppSchedulers(RepositoryFragment instance, AppSchedulers appSchedulers) {
    instance.appSchedulers = appSchedulers;
  }

  @InjectedFieldSignature("ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment.githubUsersRepository")
  public static void injectGithubUsersRepository(RepositoryFragment instance,
      GithubUsersRepository githubUsersRepository) {
    instance.githubUsersRepository = githubUsersRepository;
  }
}
