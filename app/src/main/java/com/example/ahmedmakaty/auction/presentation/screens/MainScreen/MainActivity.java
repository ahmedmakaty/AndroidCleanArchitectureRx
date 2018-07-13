package com.example.ahmedmakaty.auction.presentation.screens.MainScreen;

import com.example.ahmedmakaty.auction.presentation.BaseActivity;
import com.example.ahmedmakaty.auction.presentation.BaseFragment;

public class MainActivity extends BaseActivity {

    @Override
    public BaseFragment getFragment() {
        return MainFragment.newInstance();
    }
}
