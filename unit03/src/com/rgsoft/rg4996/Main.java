package com.rgsoft.rg4996;

import java.util.*;

public class Main{

    public static void main(String args[]){

        int x; //月利润
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        double month = 0; //月奖金

        if(x <= 10){
            month = x*0.1;
        }else if(x > 10 && x <= 20){
            month = 10*0.1 + (x-10)*0.075;
        }else if(x > 20 && x <= 40){
            month = 10*0.1 + 10*0.075 + (x-20)*0.005;
        }else if(x > 40 && x <= 60){
            month = 10*0.1 + 10*0.075 + 20*0.005 + (x-40)*0.003;
        }else if(x > 60 && x <= 100){
            month = 10*0.1 + 10*0.075 + 20*0.005 + 20*0.003 + (x-60)*0.015;
        }else if(x > 100){
            month = 10*0.1 + 10*0.075 + 20*0.005 + 20*0.003 + 40*0.015 + (x-100)*0.001;
        }

        System.out.println(month);

    }
}