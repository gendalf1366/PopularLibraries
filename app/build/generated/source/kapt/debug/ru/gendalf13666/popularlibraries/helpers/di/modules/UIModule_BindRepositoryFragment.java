package ru.gendalf13666.popularlibraries.helpers.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ru.gendalf13666.popularlibraries.baselogic.userrepositories.RepositoryFragment;

@Module(subcomponents = UIModule_BindRepositoryFragment.RepositoryFragmentSubcomponent.class)
public abstract class UIModule_BindRepositoryFragment {
  private UIModule_BindRepositoryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RepositoryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RepositoryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RepositoryFragmentSubcomponent extends AndroidInjector<RepositoryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RepositoryFragment> {}
  }
}
