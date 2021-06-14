package com.rgsoft.rg4872;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double s = 0;

        if(m <= 10){
            s = m*0.1;
        }else if(m > 10 && m <= 20){
            s = 10*0.1+(m-10)*0.075;
        }else if(m > 20 && m <= 40){
            s = 10*0.1+10*0.075+(m-20)*0.05;
        }else if(m > 40 && m <= 60){
            s = 10*0.1+10*0.075+20*0.05+(m-40)*0.03;
        }else if(m > 60 && m <= 100){
            s = 10*0.1+10*0.075+20*0.05+20*0.03+(m-60)*0.015;
        }else if(m > 100){
            s = 10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(m-100)*0.01;
        }

        System.out.println(s);

    }

}
