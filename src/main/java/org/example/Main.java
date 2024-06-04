package org.example;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("test.txt"));
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            System.out.println(line);
        }
    }
}