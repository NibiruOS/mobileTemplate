package @packageName@.client.core.impl.ui;

import org.nibiru.mobile.core.api.ui.AlertManager;
import org.nibiru.mobile.core.api.ui.mvp.View;
import org.nibiru.mobile.core.api.ui.place.Place;
import org.nibiru.mobile.core.impl.mvp.BasePresenter;

import javax.inject.Inject;

public class HomePresenter extends BasePresenter<HomePresenter.Display> {
    public interface Display extends View {
    }

    @Inject
    public HomePresenter(Display view,
                             AlertManager alertManager) {
        super(view, alertManager);
    }

    @Override
    public void go(Place place) {
    }
}