package com.rgsoft1.rg5064;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (i < 11) {
            if (i%2 == 0){
                i += 3;
            } else {
                i--;
                continue;
            }
        }
        System.out.print(i);
    }

}
