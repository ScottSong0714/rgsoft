package com.rgsoft1.rg5053;

public class Main {

    public static void main(String[] args) {
        for (int i = 0, j = 10, k = 0; i <= j; i++, j-=3, k = i+j) {
            System.out.print(k);
        }
    }

}
