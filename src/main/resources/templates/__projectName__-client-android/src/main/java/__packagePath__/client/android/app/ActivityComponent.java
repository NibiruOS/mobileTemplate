package @packageName@.client.android.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import @packageName@.client.core.impl.ui.UiMessages;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class}, dependencies = AppComponent.class)
public interface ActivityComponent {
    Activity activity();

    Context context();

    Resources resources();
}
