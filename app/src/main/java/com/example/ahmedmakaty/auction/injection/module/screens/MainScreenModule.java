package com.example.ahmedmakaty.auction.injection.module.screens;

import com.example.ahmedmakaty.auction.presentation.screens.MainScreen.MainViewModelFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainScreenModule {

    @Provides
    MainViewModelFactory providesMainViewModelFactory() {
        return new MainViewModelFactory();
    }
}
