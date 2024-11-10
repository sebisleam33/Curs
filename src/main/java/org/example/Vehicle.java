package org.example;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private final String type;
    private final int number;
    private final int kilometers;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", number=" + number + '\'' +
                ", kilometers =" + kilometers
                '}';
    }
}
