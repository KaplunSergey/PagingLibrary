package com.example.paginglibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerStorage {

    private long computerId = 0;
    private List<Computer> computerList;

    ComputerStorage() {
        initValue(100);
    }

    public List<Computer> getValue(int startPosition, int size) {
        if (startPosition >= computerList.size()) {
            return new ArrayList<>();
        }
        return computerList.subList(startPosition, startPosition + size);
    }

    private void initValue(int size) {
        Random price = new Random();
        computerList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Computer computer = new Computer();
            computer.setId(++computerId);
            computer.setModel("Xiaomi");
            computer.setPrice(price.nextInt(50000) + 30000);
            computerList.add(computer);
        }
    }
}
