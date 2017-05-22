package @packageName@.client.core.impl.ioc;

import @packageName@.client.core.impl.ui.UiMessages;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import org.nibiru.mobile.core.api.config.BaseUrl;
import org.nibiru.mobile.java.serializer.jackson.JacksonSerializer;
import org.nibiru.ui.core.impl.i18n.MessageProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class JavaModule {
    @Provides
    @BaseUrl
    public String baseUrl() {
        return "http://localhost:8080/@packageName@.server/";
    }

    @Provides
    public JacksonSerializer serializer(ObjectMapper mapper) {
        return new JacksonSerializer(mapper);
    }

    @Provides
    public ObjectMapper objectMapper(com.fasterxml.jackson.databind.Module jacksonModule) {
        ObjectMapper jacksonMapper = new ObjectMapper();
        jacksonMapper.registerModule(jacksonModule);
        // MOE needs changing this parameter
        jacksonMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        return jacksonMapper;
    }

    @Provides
    public com.fasterxml.jackson.databind.Module jacksonModule() {
        SimpleModule jacksonModule = new SimpleModule("@name@", new Version(1,
                0,
                0,
                "SNAPSHOT",
                "@packageName@.@name@.client.core",
                "jackson"));
        // TODO: Add mappings for any required DTO, such as:
        // jacksonModule.addAbstractTypeMapping(StatusDto.class, StatusDtoImpl.class);
        return jacksonModule;
    }

    @Provides
    public UiMessages uiMessages() {
        return new MessageProvider<UiMessages>(UiMessages.class).get();
    }
}
