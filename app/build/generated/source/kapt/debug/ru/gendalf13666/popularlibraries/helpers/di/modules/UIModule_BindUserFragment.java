package ru.gendalf13666.popularlibraries.helpers.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ru.gendalf13666.popularlibraries.baselogic.user.UserFragment;

@Module(subcomponents = UIModule_BindUserFragment.UserFragmentSubcomponent.class)
public abstract class UIModule_BindUserFragment {
  private UIModule_BindUserFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UserFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UserFragmentSubcomponent extends AndroidInjector<UserFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UserFragment> {}
  }
}
