package @packageName@.client.teavm.app;

import @packageName@.client.core.impl.ioc.AppModule;

import org.nibiru.mobile.core.api.app.Bootstrap;
import org.nibiru.mobile.teavm.ioc.DefaultTeaVmHardwareModule;
import org.nibiru.mobile.teavm.ioc.DefaultTeaVmModule;
import org.nibiru.ui.core.impl.ioc.CoreModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class,
        TeaVmModule.class,
        DefaultTeaVmModule.class,
        DefaultTeaVmHardwareModule.class,
        CoreModule.class,
        org.nibiru.ui.teavm.ioc.TeaVmModule.class,
        org.nibiru.async.teavm.ioc.TeaVmModule.class})
@Singleton
public interface Injector {
    Bootstrap getBootstrap();
}
