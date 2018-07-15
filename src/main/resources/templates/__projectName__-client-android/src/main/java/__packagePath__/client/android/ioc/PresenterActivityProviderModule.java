package @packageName@.client.android.ioc;

import android.app.Activity;

import @packageName@.client.android.ui.PresenterActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterActivityProviderModule {
    @Provides
    public Activity provideActivity(PresenterActivity activity) {
        return activity;
    }
}
