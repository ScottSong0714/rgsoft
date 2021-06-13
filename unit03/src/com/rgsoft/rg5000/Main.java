package com.rgsoft.rg5000;

import java.util.*;

public class Main{

    public static void main(String args[]){
        int num;
        Scanner  cin = new Scanner(System.in);
        num = cin.nextInt();
        if(num/10000%10 == num%10 && num/1000%10 == num/10%10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}