package com.S1;

/**
 * Created by zhaoziqi on 17/6/18.
 */
public class StringBufferTest {

    public void printLine(int length ){

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++)
        {

            stringBuffer.append("-");
        }
        System.out.println(stringBuffer);
    }
    public static void main(String[] s){
        StringBufferTest test = new StringBufferTest();
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("12345678");
        test.printLine(stringBuffer.length());
        System.out.println(stringBuffer.length());
        test.printLine(stringBuffer.length());
        System.out.println(stringBuffer.toString().length());
        test.printLine(stringBuffer.length());
        System.out.println(stringBuffer);
        test.printLine(stringBuffer.length());
        System.out.println(stringBuffer.toString());
        stringBuffer.append("9");
        System.out.println(stringBuffer);
        test.printLine(stringBuffer.length());
        stringBuffer.delete(0,5);
        System.out.println(stringBuffer);
        test.printLine(stringBuffer.length());
        stringBuffer.delete(0,5);
        System.out.println(stringBuffer);
        test.printLine(stringBuffer.length());





    }

}
/*
*stringbuffer 字符串加减
*
 */