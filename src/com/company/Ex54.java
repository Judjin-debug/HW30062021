package com.company;

import java.io.File;

public class Ex54 {

    public static void main (String[] args) {

        RandomNumberArrayToFile[] f = new RandomNumberArrayToFile[5];

        for (int i = 0; i <5 ; i++) {
            f[i] = new RandomNumberArrayToFile();
            f[i].start();
        };

    }

}
