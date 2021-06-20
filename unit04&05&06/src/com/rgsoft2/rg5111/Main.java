package com.rgsoft2.rg5111;

public class Main {

    public static void main(String[] args) {

        int k;
        int a[][] = new int[][] {{1, 2, 3}, {4, 5, 6},
                {7, 8, 9}};
        for (k = 0; k < 3; k++) {
            System.out.println(a[k][2-k]);
        }

    }

}
