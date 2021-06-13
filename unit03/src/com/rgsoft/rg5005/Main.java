package com.rgsoft.rg5005;

import java.util.*;

public class Main{

    public static void main(String args[]){
        //输入等级
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);;
        switch(grade){
            case 'A':
                System.out.println("85~100");break;
            case 'B':
                System.out.println("70~84");break;
            case 'C':
                System.out.println("60~69");break;
            case 'D':
                System.out.println("0~60");break;
            default:
                System.out.println("error");break;
        }
    }

}