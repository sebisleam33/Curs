package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("sebi");
        names.add("andre");
        names.add("claudu");
        names.add("debi");
        names.add("raul");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dobrogea");
        list2.add("Baia Mare");

        new Main().printList(names);
        new Main().printList(list2);

    }
    
    void printList(List<String> list){
        for (String name : list) {
            System.out.println(name);
        }
    }
}