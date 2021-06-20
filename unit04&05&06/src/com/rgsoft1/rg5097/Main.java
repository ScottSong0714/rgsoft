package com.rgsoft1.rg5097;

public class Main {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4}, i, j = 1, s = 0;
        for (i = 3; i >= 0; i--) {
            s += a[i]*j;
            j *= 10;
        }
        System.out.println( s );
    }

}
