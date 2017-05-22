package @packageName@.client.android.app;

import @packageName@.client.android.R;

import org.nibiru.ui.android.style.ReflectionStyleResolver;
import org.nibiru.ui.android.style.StyleResolver;

import dagger.Module;
import dagger.Provides;

@Module
public class AppAndroidModule {
    @Provides
    public StyleResolver styleResolver() {
        return new ReflectionStyleResolver(R.style.class);
    }
}
