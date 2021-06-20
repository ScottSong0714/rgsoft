package com.rgsoft2.rg5086;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0, num = 0;
        double avg;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum/10;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
                num++;
            } else {
                continue;
            }
        }
        System.out.println();
        System.out.println("number=" + num);
    }

}
