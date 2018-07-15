package @packageName@.client.android.ioc;

import @packageName@.client.android.ui.BootstrapActivity;
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
        BootstrapActivityProviderModule.class,
        DefaultJavaModule.class,
        DefaultAndroidModule.class,
        AndroidModule.class,
        org.nibiru.async.android.ioc.AndroidModule.class,
        AppModule.class,
        JavaModule.class
})
public interface BootstrapActivitySubcomponent
        extends AndroidInjector<BootstrapActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BootstrapActivity> {
    }
}