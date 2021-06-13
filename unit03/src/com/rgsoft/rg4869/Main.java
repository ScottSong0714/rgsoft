package com.rgsoft.rg4869;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 90) {
            System.out.println("A");
        }else if(a >= 60 && a<89) {
            System.out.println("B");
        }else if(a < 60) {
            System.out.println("C");
        }
    }

}
