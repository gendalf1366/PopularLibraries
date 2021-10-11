package ru.gendalf13666.popularlibraries.helpers.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ru.gendalf13666.popularlibraries.baselogic.users.UsersFragment;

@Module(subcomponents = UIModule_BindUsersFragment.UsersFragmentSubcomponent.class)
public abstract class UIModule_BindUsersFragment {
  private UIModule_BindUsersFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UsersFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UsersFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UsersFragmentSubcomponent extends AndroidInjector<UsersFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UsersFragment> {}
  }
}
