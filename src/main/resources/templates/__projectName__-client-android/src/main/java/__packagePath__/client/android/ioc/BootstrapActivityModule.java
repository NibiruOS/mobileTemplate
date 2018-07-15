package @packageName@.client.android.ioc;

import android.app.Activity;

import @packageName@.client.android.ui.BootstrapActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = BootstrapActivitySubcomponent.class)
abstract class BootstrapActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(BootstrapActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindBootstrapActivityInjectorFactory(BootstrapActivitySubcomponent.Builder builder);
}