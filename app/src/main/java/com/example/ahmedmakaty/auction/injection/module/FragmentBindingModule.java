package com.example.ahmedmakaty.auction.injection.module;


import com.example.ahmedmakaty.auction.injection.module.screens.MainScreenModule;
import com.example.ahmedmakaty.auction.injection.scopes.PerActivity;
import com.example.ahmedmakaty.auction.presentation.screens.MainScreen.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = {MainScreenModule.class})
    abstract MainFragment bindPaymentMethodsScreen();
}
