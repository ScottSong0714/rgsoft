package com.rgsoft.rg5003;

import java.util.*;

public class Main{

    public static void main(String args[]){

        double d1,d2;
        char op;
        //输入两个浮点数和操作符
        Scanner sc = new Scanner(System.in);
        d1 = sc.nextDouble();
        op = sc.next().charAt(0);
        d2 = sc.nextDouble();
        switch(op){
            case '+':
                System.out.println(d1+d2);break;
            case '-':
                System.out.println(d1-d2);break;
            case '*':
                System.out.println(d1*d2);break;
            case '/':
                if(d2 == 0)
                    System.out.println("Dividend cannot be 0");
                else
                    System.out.println(d1/d2);
                break;
            default:
                System.out.println("Illegal operator");break;
        }
    }

}