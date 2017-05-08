package @package@.@name@.client.core.impl.ioc;

import @package@.@name@.client.core.impl.ui.AppPresenterMapper;
import @package@.@name@.client.core.impl.ui.HomeDisplay;
import @package@.@name@.client.core.impl.ui.HomePresenter;

import org.nibiru.mobile.core.api.app.EntryPoint;
import org.nibiru.mobile.core.api.config.AppName;
import org.nibiru.mobile.core.api.config.AppVersion;
import org.nibiru.mobile.core.api.config.BaseUrl;
import org.nibiru.mobile.core.api.http.HttpManager;
import org.nibiru.mobile.core.api.serializer.Serializer;
import org.nibiru.mobile.core.api.service.BasicPushServiceFactory;
import org.nibiru.mobile.core.api.service.PushService;
import org.nibiru.mobile.core.api.service.RemoteService;
import org.nibiru.mobile.core.api.ui.mvp.PresenterMapper;
import org.nibiru.mobile.core.impl.service.RestService;
import org.nibiru.mobile.core.impl.service.SerializablePushService;
import org.nibiru.ui.core.api.ResourcesBasePath;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoModule {
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

    /* Business bindings */
    @Provides
    public SecurityManager getSecurityManager(SecurityManagerImpl manager) {
        return manager;
    }

    @Provides
    @AppName
    public String appName() {
        return AppConstants.APP_NAME;
    }

    @Provides
    @AppVersion
    public Integer appVersion() {
        return AppConstants.APP_VERSION;
    }

    @Provides
    @ResourcesBasePath
    public String resourcesBasePath() {
        return "@packagePath@/demo/client/core/resources/";
    }
}
