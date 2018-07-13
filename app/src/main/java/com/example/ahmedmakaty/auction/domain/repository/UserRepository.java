package com.example.ahmedmakaty.auction.domain.repository;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface UserRepository {
    Flowable<String> generateToken(String deviceId);

}
