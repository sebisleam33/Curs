package org.example;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if(file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("File deletion had some error.");
        }
    }
}