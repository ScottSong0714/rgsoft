package com.rgsoft.rg4997;

import java.util.*;

public class Main{

    public static void main(String args[]){
        int day=0;      // 日期
        int month=0;    // 月份
        int year=0;     // 年份
        Scanner  cin = new Scanner(System.in);
        year = cin.nextInt();
        month = cin.nextInt();
        day = cin.nextInt();
        // Write your own code
        if(year%4==0 && year%100!=0){
            switch (month) {
                case 1:
                    System.out.println(day);break;
                case 2:
                    System.out.println(31+day);break;
                case 3:
                    System.out.println(31+29+day);break;
                case 4:
                    System.out.println(31+29+31+day);break;
                case 5:
                    System.out.println(31+29+31+30+day);break;
                case 6:
                    System.out.println(31+29+31+30+31+day);break;
                case 7:
                    System.out.println(31+29+31+30+31+30+day);break;
                case 8:
                    System.out.println(31+29+31+30+31+30+31+day);break;
                case 9:
                    System.out.println(31+29+31+30+31+30+31+31+day);break;
                case 10:
                    System.out.println(31+29+31+30+31+30+31+31+30+day);break;
                case 11:
                    System.out.println(31+29+31+30+31+30+31+31+30+31+day);break;
                case 12:
                    System.out.println(31+29+31+30+31+30+31+31+30+31+30+day);break;
            }
        }else {
            switch (month) {
                case 1:
                    System.out.println(day);break;
                case 2:
                    System.out.println(31 + day);break;
                case 3:
                    System.out.println(31 + 28 + day);break;
                case 4:
                    System.out.println(31 + 28 + 31 + day);break;
                case 5:
                    System.out.println(31 + 28 + 31 + 30 + day);break;
                case 6:
                    System.out.println(31 + 28 + 31 + 30 + 31 + day);break;
                case 7:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + day);break;
                case 8:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + day);break;
                case 9:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day);break;
                case 10:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day);break;
                case 11:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day);break;
                case 12:
                    System.out.println(31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day);break;
            }
        }
    }
}
