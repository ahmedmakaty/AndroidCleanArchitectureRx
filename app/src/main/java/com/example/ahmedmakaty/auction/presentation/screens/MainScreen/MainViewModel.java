package com.example.ahmedmakaty.auction.presentation.screens.MainScreen;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.subscribers.DisposableSubscriber;
import retrofit2.HttpException;

public class MainViewModel extends ViewModel {

    enum State {
        Start,
        Pay
    }

    MutableLiveData<Boolean> progressDialogSLD = new MutableLiveData<Boolean>();
    MutableLiveData<Boolean> noInternetConnectionSLD = new MutableLiveData<Boolean>();
    MutableLiveData<String> apiErrorSLD = new MutableLiveData<String>();
    MutableLiveData<Boolean> cardChargedSLD = new MutableLiveData<Boolean>();
    MutableLiveData<Boolean> dataReadySLD = new MutableLiveData<Boolean>();
    MutableLiveData<Boolean> noCardsFoundALD = new MutableLiveData<Boolean>();

    MutableLiveData<ArrayList<String>> creditCardsSLD = new MutableLiveData<ArrayList<String>>();
    ArrayList<String> creditCards;

    State state = State.Start;

    @Inject
    public MainViewModel() {
        //this.getAccountCardsUseCase = getAccountCardsUseCase;

        creditCards = new ArrayList<>();
    }

//    public void getAccountCreditCards() {
//        progressDialogSLD.postValue(true);
//        getAccountCardsUseCase.execute(new DisposableSubscriber<List<CreditCard>>() {
//            @Override
//            public void onNext(List<CreditCard> cards) {
//                if (cards.size() > 0) {
//                    dataReadySLD.postValue(true);
//                    prepareCards(cards);
//                    state = State.Pay;
//                    creditCardsSLD.postValue(creditCards);
//                } else {
//                    noCardsFoundALD.postValue(true);
//                }
//                progressDialogSLD.postValue(false);
//
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                GeneralResponse error = null;
//                try {
//                    error = new Gson().fromJson(((HttpException) t).response().errorBody().string(), GeneralResponse.class);
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//                if (t instanceof HttpException) {
//                    apiErrorSLD.postValue(error.getMessage());
//                } else if (t instanceof NoInternetConnectionException) {
//                    noInternetConnectionSLD.postValue(true);
//                }
//                progressDialogSLD.postValue(false);
//            }
//
//            @Override
//            public void onComplete() {
//                progressDialogSLD.postValue(false);
//            }
//        }, Constants.STATUS_ACTIVE);
//    }

    @Override
    protected void onCleared() {
        super.onCleared();
        //getAccountCardsUseCase.dispose();
    }
}
