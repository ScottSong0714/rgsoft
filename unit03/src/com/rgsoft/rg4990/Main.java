package com.rgsoft.rg4990;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3-1; i++) {
            for (int j = 0; j < 3-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
            if(i < 3)
                System.out.print(" ");
        }

    }

}
