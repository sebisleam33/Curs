package org.example;

import java.util.concurrent.CountDownLatch;

class someThread extends Thread {
    private CountDownLatch latch;

    public someThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override

    public void run () {
        System.out.println("Started thread: "+Thread.currentThread().getName());
        System.out.println("Ended thread: " + Thread.currentThread().getName());
        System.out.println("**************");
        latch.countDown();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        someThread thread1 = new someThread(latch);
        someThread thread2 = new someThread(latch);
        someThread thread3 = new someThread(latch);
        someThread thread4 = new someThread(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        latch.await();
        System.out.println("Main thread: "+ Thread.currentThread().getName());
    }
}