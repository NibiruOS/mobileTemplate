package @packageName@.client.gwt.app;

import com.google.gwt.core.client.GWT;
import @packageName@.client.core.impl.ui.UiMessages;
import @packageName@.client.gwt.service.AutoBeanDtoFactory;
import @packageName@.client.gwt.ui.GwtUiMessages;

import org.nibiru.mobile.core.api.config.BaseUrl;
import org.nibiru.mobile.core.api.serializer.Serializer;
import org.nibiru.mobile.gwt.app.DatabaseBootstrap;
import org.nibiru.mobile.gwt.data.DummyDatabaseBootstrap;
import org.nibiru.mobile.gwt.serializer.AutoBeanSerializer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class GwtModule {
    /* UI bindings */
    @Provides
    public UiMessages getUiMessages() {
        return GWT.create(GwtUiMessages.class);
    }

    /* Database bindings */
    @Provides
    public DatabaseBootstrap getDatabaseBootstrap(DummyDatabaseBootstrap dbBootstrap) {
        return dbBootstrap;
    }

    @Provides
    @BaseUrl
    public String baseUrl() {
        return GWT.getHostPageBaseURL() + "../@packageName@.server/";
    }

    @Provides
    public Serializer serializer(AutoBeanDtoFactory dtoFactory) {
        return new AutoBeanSerializer(dtoFactory);
    }

    @Provides
    public AutoBeanDtoFactory autoBeanDtoFactory() {
        return GWT.create(AutoBeanDtoFactory.class);
    }

    // TODO: Add any DTO binding here, like:
    //@Provides
    //public StatusDto statusDto(AutoBeanDtoFactory dtoFactory) {
    //    return dtoFactory.status().as();
    //}
}
