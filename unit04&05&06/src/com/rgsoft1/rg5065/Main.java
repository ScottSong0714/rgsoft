package com.rgsoft1.rg5065;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            System.out.print(++i);
            if (i == 7)
                break;
        } while (i < 9);
    }

}
