package com.S1;

public class Main {
    private String a;
    private String b;
    Main(String a,String b){
        this.a = a;
        this.b = b;

    }
    public String getA(){
        return a;
    }
    public String getB(){
        return b;
    }
    public static void main(String[] args) {
        int i = 12345678;
        int size = i%10;
        System.out.println(size);
    }
}
