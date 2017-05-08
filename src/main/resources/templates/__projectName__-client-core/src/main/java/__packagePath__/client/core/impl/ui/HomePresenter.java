package @package@.@name@.client.core.impl.ui;

import org.nibiru.mobile.core.api.ui.AlertManager;
import org.nibiru.mobile.core.api.ui.place.Place;
import org.nibiru.mobile.core.api.ui.place.PlaceManager;
import org.nibiru.ui.core.api.HasClickHandler;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

public class HomePresenter extends BasePresenter<HomePresenter.Display> {
    public interface Display extends DemoView {
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
