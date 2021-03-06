package com.example.ahmedmakaty.auction.domain.interactor;

import com.example.ahmedmakaty.auction.domain.executer.PostExecutionThread;
import com.example.ahmedmakaty.auction.domain.executer.ThreadExecutor;
import com.example.ahmedmakaty.auction.domain.helper.FlowableUseCase;
import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class InternetConnectionUseCase extends FlowableUseCase<Boolean, Void> {

    @Inject
    public InternetConnectionUseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
    }

    @Override
    public Flowable<Boolean> buildUseCaseObservable(Void v) {
        return ReactiveNetwork
                .checkInternetConnectivity()
                .toFlowable();
    }
}

