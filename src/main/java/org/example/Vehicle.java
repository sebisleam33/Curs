package org.example;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private final String type;
    private final int number;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
