package com.company;

public class Ex53 {

    public static void main (String[] args) {

        RandomNumberMaxElementThreadName[] r = new RandomNumberMaxElementThreadName[10];
        Thread[] t = new Thread[10];

        for (int i = 0; i < t.length; i++) {
            r[i] = new RandomNumberMaxElementThreadName();
            t[i] = new Thread(r[i]);
            t[i].setName("Thread " + Integer.toString(i+1));
        }

        for (int i = 0; i < t.length; i ++) {
            t[i].start();
            System.out.println("Thread name is " + t[i].getName());
        }
    }

}
