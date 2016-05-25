package com.udacity.popularmovies;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import com.udacity.popularmovies.model.Model;

public class PopularMoviesApplication extends Application {

    private static final int DB_SCHEMA_VERSION = 1;
    private static final String TAG = "Application";

    private Model mModel;

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the database
        RealmConfiguration.Builder realmConfigurationBuilder = new RealmConfiguration.Builder(this)
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(DB_SCHEMA_VERSION);
        RealmConfiguration realmConfiguration = realmConfigurationBuilder.build();
        Realm.setDefaultConfiguration(realmConfiguration);

        mModel = new Model();

        enableStrictMode();
    }

    public static void enableStrictMode() {
        // thread violations
        final StrictMode.ThreadPolicy.Builder threadPolicyBuilder = new StrictMode.ThreadPolicy.Builder();
        threadPolicyBuilder.detectAll();
        threadPolicyBuilder.penaltyLog();
        threadPolicyBuilder.penaltyDialog();
        StrictMode.setThreadPolicy(threadPolicyBuilder.build());

        // activity leaks, unclosed resources, etc
        final StrictMode.VmPolicy.Builder vmPolicyBuilder = new StrictMode.VmPolicy.Builder();
        vmPolicyBuilder.detectAll();
        vmPolicyBuilder.penaltyLog();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            vmPolicyBuilder.detectLeakedRegistrationObjects();
        }
        StrictMode.setVmPolicy(vmPolicyBuilder.build());
    }

}
