package com.rgsoft1.rg5049;

public class Main {

    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                s = s+1;
            }
        }
        System.out.println("s = " + s);
    }

}
