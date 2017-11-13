package com.S1;

/**
 * Created by zhaoziqi on 17/6/11.
 */
import java.util.Scanner;
/*
 * for循环练习
 * 阶乘输出
 *
 */

public class Factorial {

    public static void main(String[] args) {

        System.out.println("please enter the number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 1 ;
        int i =2;
        String oc = "1";
        String oo = "=";
        System.out.println(oc);
        System.out.println("=");
        for (;number >= i;)
        {
            oc = (oc + "x"+i);
            System.out.println(oc);
            oo = (oo + "==");
            System.out.println(oo);
            count = count * i;
            i++;
        }
        System.out.println(oc+"="+count);
        in.close();
    }
}
