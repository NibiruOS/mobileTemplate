package @packageName@.client.core.impl.ui;

import org.nibiru.ui.core.api.Image;
import org.nibiru.ui.core.api.RelativePanel;
import org.nibiru.ui.core.impl.builder.UiBuilder;

import javax.inject.Inject;

public class HomeDisplay
        extends BaseView
        implements HomePresenter.Display {
    private final RelativePanel container;

    @Inject
    public HomeDisplay(UiBuilder uiBuilder,
                       UiMessages uiMessages,
                       Styles styles) {
        super(uiBuilder);
        final Image logo;
        container = relativePanel()
                .style(styles.container())
                .prepare(logo = image()
                        .value("logo.png")
                        .style(styles.mainTitle())
                        .build())
                    .alignTop()
                    .centerHorizontally()
                .add()
                .prepare(button()
                        .value(uiMessages.ok())
                        .style(style()
                                .marginTop(30)
                                .build())
                        .build())
                    .below(logo)
                    .centerHorizontally()
                .add()
                .build();
    }

    @Override
    public Object asNative() {
        return container.asNative();
    }
}