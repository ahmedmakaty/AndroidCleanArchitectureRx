package com.example.ahmedmakaty.auction.presentation.screens.MainScreen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.ahmedmakaty.auction.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ClickListener clickListener;
    ArrayList<String> creditCards;

    String ptVisa = "^4[0-9]{6,}$";
    String ptMasterCard = "^5[1-5][0-9]{5,}$";

    public MainAdapter() {
        creditCards = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_base, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.getView().setOnClickListener((View view) -> {
            if (clickListener != null) {
            }
            //clickListener.onItemClickListener(c, position);
        });

        holder.creditCardRadioButton.setOnClickListener((View view) -> {
            if (clickListener != null) {
            }
            //clickListener.onItemClickListener(c, position);
        });


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return creditCards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        RadioButton creditCardRadioButton;
        ImageView creditCardIcon;
        TextView cardNumberMask;
        TextView expiryDate;
        View view;

        public ViewHolder(View v) {
            super(v);
            this.view = v;
        }

        public View getView() {
            return this.view;
        }

    }

    public void setData(ArrayList<String> creditCards) {
        this.creditCards = creditCards;
        notifyDataSetChanged();
    }

    public void setListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    interface ClickListener {
        void onItemClickListener(String creditCard, int position);
    }
}
