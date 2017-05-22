package @packageName@.client.core.impl.ioc;

import @packageName@.client.core.impl.AppEntryPoint;
import @packageName@.client.core.impl.ui.AppPresenterMapper;
import @packageName@.client.core.impl.ui.HomeDisplay;
import @packageName@.client.core.impl.ui.HomePresenter;

import org.nibiru.mobile.core.api.app.EntryPoint;
import org.nibiru.mobile.core.api.config.AppName;
import org.nibiru.mobile.core.api.config.AppVersion;
import org.nibiru.mobile.core.api.ui.mvp.PresenterMapper;
import org.nibiru.ui.core.api.ResourcesBasePath;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    public EntryPoint getEntryPoint(AppEntryPoint entryPoint) {
        return entryPoint;
    }

    /* UI bindings */
    @Provides
    public PresenterMapper getPresenterMapper(AppPresenterMapper manager) {
        return manager;
    }

    @Provides
    public HomePresenter.Display getHomeDisplay(HomeDisplay display) {
        return display;
    }

    @Provides
    @AppName
    public String appName() {
        return "@name@";
    }

    @Provides
    @AppVersion
    public Integer appVersion() {
        return 1;
    }

    @Provides
    @ResourcesBasePath
    public String resourcesBasePath() {
        return "@packagePath@/client/core/resources/";
    }
}
