package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberMaxElementThreadName implements Runnable {

    public void run () {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10);
        int max = randomNumber;
        for (int i = 1; i < 10; i++) {
            randomNumber = rand.nextInt(10);
            System.out.println("num=" + randomNumber);
            if (randomNumber > max) {
                max = randomNumber;
            }
        };

        System.out.println("Max number is " + max);

    };

}
