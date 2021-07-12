package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.Random;

public class Producer extends Thread {

    private static volatile boolean run = true;
    private static volatile ArrayList<Integer> arrList;
    private static volatile int count;

    public Producer (ArrayList<Integer> arrList, int count) {
        this.arrList = arrList;
        this.count = count;
    };

    public void run () {
        System.out.println("Producer starting: ");
        synchronized (arrList) {
            try {
                Random rand = new Random();
                int token;
                while (Consumer.count < 10001) {
                    if (this.arrList.size() >= 100) {
                        this.arrList.wait();
                    } else {
                        this.arrList.notifyAll();
                    }
                    ;
                    if (Consumer.count > 9999) return;
                    token = rand.nextInt();
                    this.arrList.add(token);
                    System.out.println("Element added");
                    System.out.println("Count is " + Consumer.count);
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                System.out.println("Producer terminating...");
            }
        }
    };

}