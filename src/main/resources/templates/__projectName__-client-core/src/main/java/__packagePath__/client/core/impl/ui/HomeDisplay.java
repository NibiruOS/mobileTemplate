package @packageName@.client.core.impl.ui;

import org.nibiru.ui.core.api.Image;
import org.nibiru.ui.core.api.RelativePanel;
import org.nibiru.ui.core.impl.builder.ButtonBuilder;
import org.nibiru.ui.core.impl.builder.ImageBuilder;
import org.nibiru.ui.core.impl.builder.RelativePanelBuilder;
import org.nibiru.ui.core.impl.builder.StyleBuilder;

import javax.inject.Inject;
import javax.inject.Provider;

public class HomeDisplay implements HomePresenter.Display {
    private final RelativePanel container;

    @Inject
    public HomeDisplay(UiMessages uiMessages,
                           Styles styles,
                           Provider<StyleBuilder> style,
                           Provider<RelativePanelBuilder> relativePanel,
                           Provider<ButtonBuilder> button,
                           Provider<ImageBuilder> image) {
        Image logo;
        container = relativePanel.get()
                .style(styles.container())
                .prepare(logo = image.get()
                        .value("logo.png")
                        .style(styles.mainTitle())
                        .build())
                    .alignTop()
                    .centerHorizontally()
                    .add()
                .prepare(button.get()
                        .value(uiMessages.ok())
                        .style(style.get()
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