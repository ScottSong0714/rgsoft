package com.rgsoft1.rg5073;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = a.length-1; i > -1; i--) {
            System.out.print(a[i]);
        }

    }

}
