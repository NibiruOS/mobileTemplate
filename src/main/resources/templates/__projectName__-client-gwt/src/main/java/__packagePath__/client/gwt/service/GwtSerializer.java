package @packageName@.client.gwt.service;

import com.github.nmorel.gwtjackson.client.ObjectMapper;
import com.google.gwt.core.client.GWT;

import org.nibiru.mobile.gwt.serializer.BaseJacksonSerializer;

import javax.inject.Inject;

public class GwtSerializer
        extends BaseJacksonSerializer {
    public interface IntegerMapper extends ObjectMapper<Integer> {
    }

// Add DTO serialization here
//    public interface CategoryMapper extends ObjectMapper<CategoryDto> {
//    }

    @Inject
    public GwtSerializer() {
        addMapper(Integer.class,
                GWT.create(IntegerMapper.class));
// Add DTO serialization here
//        addMapper(CategoryDto.class,
//                GWT.create(CategoryMapper.class));
    }
}
