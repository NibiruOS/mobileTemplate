package @packageName@.client.teavm.app;

import @packageName@.client.core.impl.ui.UiMessages;

import org.nibiru.mobile.core.api.config.BaseUrl;

import dagger.Module;
import dagger.Provides;

@Module
public class TeaVmModule {
    /* UI bindings */
    @Provides
    public UiMessages getUiMessages() {
        return new UiMessages() {
            @Override
            public String ok() {
                return "Okey!";
            }
        };
    }

    @Provides
    @BaseUrl
    public String baseUrl() {
        return "../com.xxx.yyy.dummyService.server/";
    }
}