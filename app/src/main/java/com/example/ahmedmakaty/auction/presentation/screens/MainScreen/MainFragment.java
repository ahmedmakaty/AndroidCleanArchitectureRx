package com.example.ahmedmakaty.auction.presentation.screens.MainScreen;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.ahmedmakaty.auction.R;
import com.example.ahmedmakaty.auction.presentation.BaseFragment;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class MainFragment extends BaseFragment implements MainAdapter.ClickListener {

    Toolbar toolbar;
    RecyclerView mRecyclerView;
    View noConnectionContent;
    RelativeLayout mainView;
    RelativeLayout mContainer;
    Button saveButton;
    Button retryButton;
    FloatingActionButton addNewCard;

    private AlertDialog mProgress;
    private MainAdapter mAdapter;

    @Inject
    MainViewModelFactory mainViewModelFactory;

    MainViewModel mainViewModel;

    public static MainFragment newInstance() {

        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidSupportInjection.inject(this);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        //initializeToolbar();

        initClickListeners();

        //setupRecyclerView();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mainViewModel = ViewModelProviders.of(this, mainViewModelFactory).get(MainViewModel.class);

        initiateLiveObservers();

        //getAccountCreditCards();
    }

    private void getAccountCreditCards() {

        //accountCardsViewModel.getAccountCreditCards();
    }

    private void initiateLiveObservers() {
//        accountCardsViewModel.progressDialogSLD.observe(this, this::showProgress);
//        accountCardsViewModel.noInternetConnectionSLD.observe(this, this::onNoInternetConnection);
//        accountCardsViewModel.dataReadySLD.observe(this, this::onSuccess);
//        accountCardsViewModel.choosenCreditCardSLD.observe(this, this::onCardChoosen);
//        accountCardsViewModel.creditCardsSLD.observe(this, this::setCards);
//        accountCardsViewModel.noCardsFoundALD.observe(this, this::onNoCardsFound);
//        accountCardsViewModel.apiErrorSLD.observe(this, this::showErrorMessage);
//        accountCardsViewModel.cardChargedSLD.observe(this, this::onCardCharged);
    }

    private void showErrorMessage(String s) {
        Snackbar.make(getView(), s, Snackbar.LENGTH_LONG);
    }

    private void onNoCardsFound(Boolean aBoolean) {
        goToPayfortScreen();
        getActivity().finish();
    }

    public void initializeToolbar() {
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(getResources().getString(R.string.main_title));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);

    }

    private void initClickListeners() {

//        addNewCard.setOnClickListener((View v) -> {
//            goToPayfortScreen();
//        });

    }

    private void goToPayfortScreen() {
        //go to payfort screen
//        Intent intent = new Intent(getActivity(), PayfortActivity.class);
//        intent.putExtra(Constants.TRANSACTION_MODEL_KEY, new Gson().toJson(accountCardsViewModel.getTransaction(), Transaction.class));
//        getActivity().startActivity(intent);
    }

    private void setupRecyclerView() {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new MainAdapter();
        mAdapter.setListener(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void showProgress(Boolean show) {
        if (mProgress != null) {
            if (show) {
                mProgress.show();
            } else {
                mProgress.dismiss();
            }
        }
    }

    private void onNoInternetConnection(Boolean aBoolean) {
        mainView.setVisibility(View.GONE);
        noConnectionContent.setVisibility(View.VISIBLE);
    }

    private void onSuccess(Boolean aBoolean) {
        mainView.setVisibility(View.VISIBLE);
        noConnectionContent.setVisibility(View.GONE);
    }

    private void onBackPressed() {
        getActivity().finish();
    }

    @Override
    public void onItemClickListener(String creditCard, int position) {
//        accountCardsViewModel.updateCheckedItem(creditCard, position);
//        accountCardsViewModel.setChoosenCreditCard(creditCard);
//        accountCardsViewModel.choosenCreditCardSLD.postValue(creditCard);
    }
}
