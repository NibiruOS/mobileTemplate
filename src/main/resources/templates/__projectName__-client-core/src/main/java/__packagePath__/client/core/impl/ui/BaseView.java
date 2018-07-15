package @packageName@.client.core.impl.ui;

import org.nibiru.ui.core.impl.builder.UiBuilder;
import org.nibiru.ui.core.impl.builder.UiBuilderWrapper;

import static com.google.common.base.Preconditions.checkNotNull;

abstract class BaseView
        implements UiBuilderWrapper {
    private final UiBuilder uiBuilder;

    public BaseView(UiBuilder uiBuilder) {
        this.uiBuilder = checkNotNull(uiBuilder);
    }

    @Override
    public UiBuilder uiBuilder() {
        return uiBuilder;
    }
}
