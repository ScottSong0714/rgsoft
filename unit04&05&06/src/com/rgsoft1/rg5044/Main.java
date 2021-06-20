package com.rgsoft1.rg5044;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (++i > 0) {
            if (i == 10) {
                break;
            }
            if (i%3 == 1) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

}
