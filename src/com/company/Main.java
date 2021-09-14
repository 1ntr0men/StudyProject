package com.company;

import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }
}
