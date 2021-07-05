package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Ex57 {

    public static void main (String[] args) {

        ArrayList<Integer> line = arrListInit();

    }

    private static ArrayList<Integer> arrListInit () {
        Random rand = new Random();
        ArrayList<Integer> result = new ArrayList<>(200);
        for (int i = 0; i < 200; i++) {
            result.add(rand.nextInt(10));
        }
        return result;
    }

}
