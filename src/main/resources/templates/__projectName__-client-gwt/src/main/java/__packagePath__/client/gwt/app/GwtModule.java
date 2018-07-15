package @packageName@.client.gwt.app;

import com.google.gwt.core.client.GWT;
import @packageName@.client.core.impl.ui.UiMessages;
import @packageName@.client.gwt.ui.GwtUiMessages;
import @packageName@.client.gwt.service.GwtSerializer;

import org.nibiru.mobile.core.api.config.BaseUrl;
import org.nibiru.mobile.core.api.serializer.Serializer;

import dagger.Module;
import dagger.Provides;

@Module
public class GwtModule {
    /* UI bindings */
    @Provides
    public UiMessages getUiMessages() {
        return GWT.create(GwtUiMessages.class);
    }

    @Provides
    @BaseUrl
    public String baseUrl() {
        return GWT.getHostPageBaseURL() + "../@packageName@.server/";
    }

    @Provides
    public Serializer serializer(GwtSerializer serializer) {
        return serializer;
    }
}
