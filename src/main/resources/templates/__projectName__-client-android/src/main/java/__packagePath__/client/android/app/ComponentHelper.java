package @packageName@.client.android.app;

import android.app.Activity;

public final class ComponentHelper {
    private ComponentHelper() {
    }

    public static UserComponent component(Activity activity) {
        AppApplication app = (AppApplication) activity.getApplication();
        return DaggerUserComponent.builder()
                .activityComponent(DaggerActivityComponent.builder()
                        .activityModule(new ActivityModule(activity))
                        .appComponent(app.getAppComponent())
                        .build())
                .build();
    }
}
