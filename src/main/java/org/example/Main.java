package org.example;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Vehicle bike = new Vehicle("Mountain Bike", 533);
        Vehicle car = new Vehicle("Toyota", 2500);

        try(FileOutputStream fos = new FileOutputStream("vehicle.dat")){
            try (ObjectOutputStream obj = new ObjectOutputStream(fos)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("File operation was successful.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}