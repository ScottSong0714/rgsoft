package com.rgsoft1.rg5063;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum*2+1;
        }
        System.out.println(sum);
    }

}
