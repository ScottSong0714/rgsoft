package com.rgsoft.rg4999;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int value = Min(a, b, c, d);
        System.out.println(value);
    }

    public static int Min(int a, int b, int c, int d){
        int min1 = a<b?a:b;
        int min2 = c<d?c:d;
        int min = min1<min2?min1:min2;
        return min;
    }

}
