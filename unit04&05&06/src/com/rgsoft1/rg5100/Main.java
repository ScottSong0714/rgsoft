package com.rgsoft1.rg5100;

import java.util.Scanner;

public class Main {

    static final int length = 5;

    static double average(double a[], int length) {
        double sum = 0;
        int i;
        for (i = 0; i < length; i++) {
            sum += a[i];
        }
            return sum / length;
    }

    public static void main(String args[]) {
        int i;
        double a[] = new double[length];
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < length; i++) {
            a[i] = scanner.nextDouble();
        }
            System.out.println(average(a, length));

    }

}
