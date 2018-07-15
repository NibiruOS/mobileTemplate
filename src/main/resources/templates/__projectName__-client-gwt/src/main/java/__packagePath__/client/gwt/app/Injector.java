package @packageName@.client.gwt.app;

import @packageName@.client.core.impl.ioc.AppModule;

import org.nibiru.mobile.core.api.app.Bootstrap;
import org.nibiru.mobile.gwt.ioc.DefaultGwtModule;
import org.nibiru.mobile.gwt.ioc.DefaultGwtPlacesModule;
import org.nibiru.mobile.gwt.ioc.DefaultGwtUiModule;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class,
        GwtModule.class,
        DefaultGwtModule.class,
        DefaultGwtPlacesModule.class,
        DefaultGwtUiModule.class,
        CoreModule.class,
        org.nibiru.ui.gwt.ioc.GwtModule.class,
        org.nibiru.async.gwt.ioc.GwtModule.class})
@Singleton
public interface Injector {
    Bootstrap getBootstrap();
}
