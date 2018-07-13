package com.example.ahmedmakaty.auction.domain.executer;

import io.reactivex.Scheduler;

public interface PostExecutionThread {
    Scheduler getScheduler();

}
