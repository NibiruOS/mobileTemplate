package @packageName@.client.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.nibiru.mobile.core.api.app.Bootstrap;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class BootstrapActivity extends AppCompatActivity {
    @Inject
    Bootstrap bootstrap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        bootstrap.onBootstrap();
        finish();
    }
}
