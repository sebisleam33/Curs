package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("sebi");
        names.add("andre");
        names.add("claudu");
        names.add("debi");
        names.add("raul");

        System.out.println(names);
        System.out.println(names.size());
        names.add(4, "darius");
        System.out.println(names);
        names.set(2, "mike");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

    }
}