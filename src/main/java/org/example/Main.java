package org.example;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))){
            bw.write("Sebastian");
            bw.newLine();
            bw.write("Otter");
            bw.newLine();
            bw.write("Zeus");

            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
    }
}