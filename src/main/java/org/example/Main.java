/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.example;

import java.util.ArrayList;

class IntWrapper {
    public int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(21);
        System.out.println(numbersList.get(0));

        ArrayList<IntWrapper> numbersList2 = new ArrayList<>();
        numbersList2.add(new IntWrapper(55));
        System.out.println(numbersList2.get(0).getNum());

    }
}