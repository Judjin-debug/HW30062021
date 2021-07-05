package com.company;

public class Ex52 {

    public static void main (String[] args) {
        RandomNumberMeanAverageThread[] t = new RandomNumberMeanAverageThread[10];

        for (int i = 0; i < t.length; i++) {
            t[i] = new RandomNumberMeanAverageThread();
        }

        for (RandomNumberMeanAverageThread th : t) {
            th.start();
        }
    }

}
