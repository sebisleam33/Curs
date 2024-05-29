package org.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(4);
        try {
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(5);
            System.out.println(queue.offer(6));
            System.out.println(queue.poll());
            queue.offer(6);
        } catch (Exception e) {
            System.out.println("Wrong");
        }

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}