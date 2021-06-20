package com.rgsoft2.rg5087;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }
        int num = sc.nextInt(), n = 1;
        for (int i = 0; i < 8; i++) {
            if (a[i] == num)
                System.out.println(n);
            else
                continue;
            n++;
        }

    }

}
