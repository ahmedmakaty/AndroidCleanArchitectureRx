package com.example.ahmedmakaty.auction.presentation.screens.MainScreen;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

public class MainViewModelFactory implements ViewModelProvider.Factory {

    //GetAccountCardsUseCase getAccountCardsUseCase;

    @Inject
    public MainViewModelFactory() {
        //this.getAccountCardsUseCase = getAccountCardsUseCase;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel();
        } else {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }
}
