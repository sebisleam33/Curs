package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("stefan");
        listNames.add("sebi");
        listNames.add("andrei");
        listNames.add("raul");
        listNames.add("ema");
        System.out.println(listNames);
//        for (String temp: listNames) {
//            System.out.println(temp);
//        }

        System.out.println(listNames.get(2));
        System.out.println(listNames.remove("raul"));
        listNames.remove("raul");
        System.out.println(listNames);
        System.out.println(listNames.remove("john"));
        System.out.println(listNames.set(0, "alex"));
        System.out.println(listNames);
        System.out.println(listNames.indexOf("sebi"));
        System.out.println(listNames.indexOf("bogdan"));

    }
}