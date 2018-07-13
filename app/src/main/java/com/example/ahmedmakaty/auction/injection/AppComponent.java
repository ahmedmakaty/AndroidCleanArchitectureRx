package com.example.ahmedmakaty.auction.injection;

import android.app.Application;

import com.example.ahmedmakaty.auction.App;
import com.example.ahmedmakaty.auction.injection.module.FragmentBindingModule;
import com.example.ahmedmakaty.auction.injection.module.NetworkModule;
import com.example.ahmedmakaty.auction.injection.module.data.UserDataModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {NetworkModule.class,
        UserDataModule.class,
        AndroidSupportInjectionModule.class,
        FragmentBindingModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(App app);
}
