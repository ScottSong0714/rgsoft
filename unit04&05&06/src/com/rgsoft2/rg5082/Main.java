package com.rgsoft2.rg5082;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if(i%4 == 0 && i != 0){
                System.out.println();
                System.out.print(arr[i]);
            }
            else
                System.out.print(arr[i] + "");
        }
    }

}
