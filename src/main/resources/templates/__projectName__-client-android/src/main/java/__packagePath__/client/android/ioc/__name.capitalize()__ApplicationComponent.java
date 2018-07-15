package @packageName@.client.android.ioc;

import @packageName@.client.android.@name.capitalize()@Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        BootstrapActivityModule.class,
        PresenterActivityModule.class
})
public interface @name.capitalize()@ApplicationComponent {
    void inject(@name.capitalize()@Application application);
}