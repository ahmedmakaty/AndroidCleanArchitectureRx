package com.example.ahmedmakaty.auction.injection.module.data;

import com.example.ahmedmakaty.auction.data.UserDataRepository;
import com.example.ahmedmakaty.auction.data.cache.user.UserCache;
import com.example.ahmedmakaty.auction.data.cache.user.UserCacheImp;
import com.example.ahmedmakaty.auction.data.remote.ApiServiceInterface;
import com.example.ahmedmakaty.auction.data.remote.user.UserRemote;
import com.example.ahmedmakaty.auction.data.remote.user.UserRemoteImp;
import com.example.ahmedmakaty.auction.domain.repository.UserRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class UserDataModule {

    @Provides
    UserRepository providesUserDataRepository(UserCache userCache, UserRemote userRemote) {
        return new UserDataRepository(userCache, userRemote);
    }

    @Provides
    UserCache providesUserCache() {
        return new UserCacheImp();
    }

    @Provides
    UserRemote providesUserRemote(ApiServiceInterface apiServiceInterface) {
        return new UserRemoteImp(apiServiceInterface);
    }
}
