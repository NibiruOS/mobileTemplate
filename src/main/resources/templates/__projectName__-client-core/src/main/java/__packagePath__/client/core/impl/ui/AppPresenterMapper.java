package @packageName@.client.core.impl.ui;

import org.nibiru.mobile.core.api.ui.place.DefaultPlaces;
import org.nibiru.mobile.core.impl.mvp.BasePresenterMapper;

import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

public class AppPresenterMapper extends BasePresenterMapper {
    @Inject
    public AppPresenterMapper(Provider<HomePresenter> home) {
        checkNotNull(home);
        map(DefaultPlaces.HOME, home);
    }
}