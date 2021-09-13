package com.company;

import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void getMass(int[] mass) {
        for (int i : mass) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random objGenerator = new Random();
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
//            int randomNumber = objGenerator.nextInt(100);
            int randomNumber = (int) (Math.random() * 6);
            mass[i] = randomNumber;
        }
        getMass(mass);
        Arrays.sort(mass);
        getMass(mass);
    }
}
