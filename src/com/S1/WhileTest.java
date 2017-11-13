package com.S1;
import java.util.Scanner;
/**
 * Created by zhaoziqi on 17/6/11.
 *
 * while循环练习
 * 整数位数判断
 *
 */

public class WhileTest {
        int number = 0;
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.println("please enter the number:");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            int count = 0 ;
            while(number > 0)
            {
                number /= 10;
                count  +=1;
                System.out.println("number=" +number+";count="+count);
            }
            System.out.print(count);
            in.close();
        }

    }
