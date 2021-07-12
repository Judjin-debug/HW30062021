package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Consumer extends Thread {

    private static volatile boolean run = true;
    private static volatile ArrayList<Integer> arrList;
    public static volatile int count;

    public Consumer (ArrayList<Integer> arrList, int count) {
        this.arrList = arrList;
        this.count = count;
    };

    public void run () {
        System.out.println("Consumer starting: ");
        synchronized (arrList) {
            try {
                Random rand = new Random();
                int token;
                while (this.count < 10001) {
                    if (this.arrList.size() <= 80) {
                        this.arrList.notifyAll();
                        this.arrList.wait();
                    };
                    if (!run) break;
                    token = rand.nextInt();
                    if (this.arrList.size() > 0) {
                        this.arrList.remove(this.arrList.size() - 1);
                    };
                    System.out.println("Element removed, count is " + count);
                    count++;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                System.out.println("Consumer terminating...");
                run = false;
                arrList.notifyAll();
            }
        }
    };

}
