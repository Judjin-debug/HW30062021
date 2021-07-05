package com.company;

import java.io.*;
import java.util.Random;

public class RandomNumberArrayToFile extends Thread {

    public void run () {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createFilename(), false)))
        {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
              bufferedWriter.write(Integer.toString(rand.nextInt(10)) + " ");
            };
        } catch (IOException iex) {
            iex.printStackTrace();
        };

    };

    private String createFilename () {
        String result = "src/text" + this.getId() + ".txt";
        return result;
    };

}
