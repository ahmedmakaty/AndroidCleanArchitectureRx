package com.example.ahmedmakaty.auction.data;


import com.example.ahmedmakaty.auction.data.cache.user.UserCache;
import com.example.ahmedmakaty.auction.data.remote.user.UserRemote;
import com.example.ahmedmakaty.auction.domain.repository.UserRepository;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class UserDataRepository implements UserRepository {

    private UserCache userCache;
    private UserRemote userRemote;

    @Inject
    public UserDataRepository(UserCache userCache, UserRemote userRemote) {
        this.userCache = userCache;
        this.userRemote = userRemote;
    }

    @Override
    public Flowable<String> generateToken(String deviceId) {
        return userRemote.generateToken(deviceId);
    }

}
