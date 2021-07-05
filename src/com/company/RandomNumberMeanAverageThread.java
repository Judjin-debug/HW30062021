package com.company;

import java.util.Random;

public class RandomNumberMeanAverageThread extends Thread {

    public void run () {
        Random rand = new Random();

      double result = 0;
      int randomNumber;
        for (int i = 0; i < 10; i++) {
            randomNumber = rand.nextInt(10);
            System.out.println("num=" + randomNumber);
            result += randomNumber;
        }

        result /= 10;
        System.out.println("Mean average is " + result);

    };

}
