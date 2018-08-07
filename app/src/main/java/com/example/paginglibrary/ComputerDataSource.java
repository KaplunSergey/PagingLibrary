package com.example.paginglibrary;

import android.arch.paging.PositionalDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

public class ComputerDataSource extends PositionalDataSource<Computer> {

    private static final String TAG = ComputerDataSource.class.getSimpleName();
    private ComputerStorage storage;

    public ComputerDataSource(@NonNull ComputerStorage storage) {
        this.storage = storage;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull LoadInitialCallback<Computer> callback) {
        Log.d(TAG, "loadInitial, requestedStartPosition = " + params.requestedStartPosition +
                ", requestedLoadSize = " + params.requestedLoadSize);
        List<Computer> value = storage.getValue(params.requestedStartPosition, params.requestedLoadSize);
        callback.onResult(value, 0);
    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull LoadRangeCallback<Computer> callback) {
        Log.d(TAG, "loadRange, startPosition = " + params.startPosition + ", loadSize = " + params.loadSize);
        List<Computer> value = storage.getValue(params.startPosition, params.loadSize);
        callback.onResult(value);
    }
}
