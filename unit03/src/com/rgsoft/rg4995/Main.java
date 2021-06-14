package com.rgsoft.rg4995;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 0 && a < 60) {
            System.out.println("C");
        }else if(a >= 60 && a < 90){
            System.out.println("B");
        }else if(a >= 90){
            System.out.println("C");
        }

    }

}
