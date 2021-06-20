package com.rgsoft2.rg5301;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = str.charAt(str.length()-1-i);
            if (a != b) {
                System.out.println("NO");
                break;
            } else
                n = 1;
        }
        if (n == 1)
            System.out.println("YES");

    }

}
