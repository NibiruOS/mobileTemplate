package @packageName@.client.android;

import android.app.Activity;
import android.app.Application;

import @packageName@.client.android.ioc.Dagger@name.capitalize()@ApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class @name.capitalize()@Application
        extends Application
        implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        Dagger@name.capitalize()@ApplicationComponent.create()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}