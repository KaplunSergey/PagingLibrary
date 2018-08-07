package com.example.paginglibrary;

import java.util.Objects;

public class Computer {
    private long id;
    private String model;
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getId() == computer.getId() &&
                getPrice() == computer.getPrice() &&
                Objects.equals(getModel(), computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getPrice());
    }
}
