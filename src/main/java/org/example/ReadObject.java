package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("vehicle.dat")) {
            try (ObjectInputStream obj = new ObjectInputStream(fis)){
                Vehicle v1 = (Vehicle) obj.readObject();
                Vehicle v2 = (Vehicle) obj.readObject();
                System.out.println(v1);
                System.out.println(v2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
