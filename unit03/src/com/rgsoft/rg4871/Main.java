package com.rgsoft.rg4871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("prices=3.00");break;
            case 2:
                System.out.println("prices=2.50");break;
            case 3:
                System.out.println("prices=4.10");break;
            case 4:
                System.out.println("prices=10.20");break;
            default:
                System.out.println("prices=0");break;
        }

    }

}
