package @packageName@.client.android.ioc;

import android.app.Activity;

import @packageName@.client.android.ui.PresenterActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PresenterActivitySubcomponent.class)
abstract class PresenterActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(PresenterActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindPresenterActivityInjectorFactory(PresenterActivitySubcomponent.Builder builder);
}