package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Ex57 {

    public static void main (String[] args) {

        ArrayList<Integer> line = arrListInit();
        int count = 0;
        Consumer consumer1 = new Consumer(line, count);
        Consumer consumer2 = new Consumer(line, count);
        Consumer consumer3 = new Consumer(line, count);
        Producer producer1 = new Producer(line, count);
        Producer producer2 = new Producer(line, count);
        consumer1.start();
        consumer2.start();
        consumer3.start();
        producer1.start();
        producer2.start();

    }

    private static ArrayList<Integer> arrListInit () {
        Random rand = new Random();
        ArrayList<Integer> result = new ArrayList<>(200);
        for (int i = 0; i < 200; i++) {
            result.add(rand.nextInt(10));
        }
        return result;
    };

    private static void arrListPrint (ArrayList<Integer> arrList) {
        System.out.println("Printing ArrayList: ");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    };

}
