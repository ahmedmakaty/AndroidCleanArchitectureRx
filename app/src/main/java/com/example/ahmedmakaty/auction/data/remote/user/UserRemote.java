package com.example.ahmedmakaty.auction.data.remote.user;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface UserRemote {
    Flowable<String> generateToken(String deviceId);

}
