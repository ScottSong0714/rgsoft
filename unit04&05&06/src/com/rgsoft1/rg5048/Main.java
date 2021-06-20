package com.rgsoft1.rg5048;

public class Main {

    public static void main(String[] args) {
        int num = 729, digit;
        do {
            digit = num%10;
            num = num/10;
            System.out.println(digit);
        } while (num > 0);
    }

}
