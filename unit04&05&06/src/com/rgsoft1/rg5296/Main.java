package com.rgsoft1.rg5296;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            avg += num;
        }
        avg /= 5;
        System.out.println(avg);

    }

}
