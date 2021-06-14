package com.rgsoft.rg4987;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double tax = 0;
        if(m < 200){
            tax = 0;
        }else if(m >= 200 && m < 400){
            tax = m*0.03;
        }else if(m >= 400 && m < 5000){
            tax = m*0.04;
        }else if(m >= 5000){
            tax = m*0.05;
        }
        System.out.println(tax);

    }

}
