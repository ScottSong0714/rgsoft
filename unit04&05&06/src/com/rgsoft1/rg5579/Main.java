package com.rgsoft1.rg5579;

public class Main {

    public static void main(String[] args) {
        int i = 3,j;
        while (i>0) {
            j = i;
            while (j>0) {
                if (j<=2)
                    break;
                System.out.println(j + "and" +i);
                j--;
            }
            i--;
        }
    }

}
