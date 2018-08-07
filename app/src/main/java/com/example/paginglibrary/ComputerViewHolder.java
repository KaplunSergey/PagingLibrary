package com.example.paginglibrary;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ComputerViewHolder extends RecyclerView.ViewHolder {

    private TextView computerId;
    private TextView computerModel;
    private TextView computerPrice;

    ComputerViewHolder(View itemView) {
        super(itemView);
        computerId = itemView.findViewById(R.id.computer_id);
        computerModel = itemView.findViewById(R.id.computer_model);
        computerPrice = itemView.findViewById(R.id.computer_price);
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    public void bind(Computer computer) {
        computerId.setText(String.format("%d", computer.getId()));
        computerModel.setText(computer.getModel());
        computerPrice.setText(Integer.toString(computer.getPrice()) + " UAH");
    }
}
