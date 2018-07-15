package @packageName@.client.android.ioc;

import android.app.Activity;

import @packageName@.client.android.ui.BootstrapActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class BootstrapActivityProviderModule {
    @Provides
    public Activity provideActivity(BootstrapActivity activity) {
        return activity;
    }
}
