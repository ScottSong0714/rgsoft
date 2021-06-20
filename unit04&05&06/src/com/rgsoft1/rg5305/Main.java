package com.rgsoft1.rg5305;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for (int i = 10; i < n; i++) {
            if (i%2 == 0 && i%3 != 0) {
                System.out.print(i+" ");
                sum += 1;
            }
            else
                continue;
            if (sum == 10) {
                System.out.println();
                sum -= 10;
            }
        }

    }

}
