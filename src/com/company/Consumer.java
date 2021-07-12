package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Consumer extends Thread {

    private ArrayList<Integer> arrList;
    private int count;

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
                while (count < 10001) {
                    if (this.arrList.size() <= 80) {
                        this.arrList.notifyAll();
                        this.arrList.wait();
                    };
                    token = rand.nextInt();
                    this.arrList.remove(this.arrList.size() - 1);
                    System.out.println("Element removed, count is " + count);
                    count++;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    };

}
