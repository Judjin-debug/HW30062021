package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Producer extends Thread {

    private ArrayList<Integer> arrList;
    private int count;
    private Lock lock;

    public Producer (ArrayList<Integer> arrList, int count, Lock lock) {
        this.arrList = arrList;
        this.count = count;
        this.lock = lock;
    };

    public void run () {
        synchronized (arrList) {
            while (count < 10000) {
                
            }
        }
    };

}
