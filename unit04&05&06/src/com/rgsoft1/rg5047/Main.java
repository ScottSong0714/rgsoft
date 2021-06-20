package com.rgsoft1.rg5047;

public class Main {

    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 100; i++) {
            j = i*10+6;
            if (j%3 != 0)
                continue;
            else
                System.out.print(j+" ");
        }
    }

}
