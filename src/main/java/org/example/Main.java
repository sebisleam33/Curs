package org.example;

import java.util.*;

import static java.lang.Thread.sleep;

class myCounter implements Runnable{
    private int threadNo;
    public myCounter(int threadNo){
        this.threadNo = threadNo;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread number: "+threadNo +" and iteration number: "+i);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new myCounter(1));
        Thread thread2 = new Thread(new myCounter(2));
        thread1.start();
        thread2.start();
    }
}