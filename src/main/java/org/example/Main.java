package org.example;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("File operation was successful");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
    }
}