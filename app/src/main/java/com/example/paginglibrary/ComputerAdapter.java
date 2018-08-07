package com.example.paginglibrary;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ComputerAdapter extends PagedListAdapter<Computer, ComputerViewHolder>{

    ComputerAdapter(DiffUtil.ItemCallback<Computer> diffUtilCallback) {
        super(diffUtilCallback);
    }

    @NonNull
    @Override
    public ComputerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.computer_view, parent, false);
        return new ComputerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComputerViewHolder holder, int position) {
        holder.bind(getItem(position));
    }
}
