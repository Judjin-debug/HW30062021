package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.Random;

public class Producer extends Thread {

    private ArrayList<Integer> arrList;
    private int count;

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
                while (count < 10001) {
                    if (this.arrList.size() >= 100) {
                        this.arrList.wait();
                    } else {
                        this.arrList.notifyAll();
                    }
                    ;
                    token = rand.nextInt();
                    this.arrList.add(token);
                    System.out.println("Element added");
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    };

}