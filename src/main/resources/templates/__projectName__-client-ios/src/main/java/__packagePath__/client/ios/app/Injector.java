package @packageName@.client.ios.app;

import @packageName@.client.core.impl.ioc.JavaModule;
import @packageName@.client.core.impl.ioc.AppModule;

import org.nibiru.mobile.core.api.app.Bootstrap;
import org.nibiru.mobile.ios.ioc.DefaultIOSModule;
import org.nibiru.mobile.java.ioc.DefaultJavaModule;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class,
        JavaModule.class,
        DefaultJavaModule.class,
        DefaultIOSModule.class,
        CoreModule.class,
        org.nibiru.ui.ios.ioc.IOSModule.class,
        org.nibiru.async.ios.ioc.IOSModule.class})
@Singleton
public interface Injector {
    Bootstrap getBootstrap();
}
