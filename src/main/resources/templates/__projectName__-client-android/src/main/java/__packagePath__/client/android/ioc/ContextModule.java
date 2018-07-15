package @packageName@.client.android.ioc;

import android.content.Context;
import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    @Provides
    public Context provideContext(Activity context) {
        return context;
    }
}
