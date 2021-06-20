package com.rgsoft2.rg5085;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
