package @packageName@.client.android.ioc;

import @packageName@.client.android.ui.PresenterActivity;
import @packageName@.client.core.impl.ioc.AppModule;
import @packageName@.client.core.impl.ioc.JavaModule;

import org.nibiru.mobile.android.ioc.DefaultAndroidModule;
import org.nibiru.mobile.java.ioc.DefaultJavaModule;
import org.nibiru.ui.android.ioc.AndroidModule;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        ContextModule.class,
        CoreModule.class,
        PresenterActivityProviderModule.class,
        DefaultJavaModule.class,
        DefaultAndroidModule.class,
        AndroidModule.class,
        org.nibiru.async.android.ioc.AndroidModule.class,
        AppModule.class,
        JavaModule.class
})
public interface PresenterActivitySubcomponent
        extends AndroidInjector<PresenterActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PresenterActivity> {
    }
}