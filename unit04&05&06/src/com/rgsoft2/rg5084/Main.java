package com.rgsoft2.rg5084;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
            else
                continue;
            sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);
    }

}
