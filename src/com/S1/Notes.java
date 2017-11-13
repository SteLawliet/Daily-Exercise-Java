package com.S1;

import java.util.ArrayList;

/**
 * Created by zhaoziqi on 17/6/11.
 */
public class Notes {

    private String a = "hello";
    private String b = "world";
    private ArrayList<String> notes = new ArrayList<String>();

    public void add(int index, String note) {

        notes.add(index - 1, note);
    }


    public void SetArrayList(int SetSize, String Setnote) {

        for (int i = 0; i < SetSize; i++) {


            notes.add(i, Setnote);
        }
    }

    public int getSize() {
        return notes.size();
    }


    public void remove(int index) {
        notes.remove(index - 1);
    }

    public void printNowSize() {
        System.out.println("NowSize=" + this.getSize());
    }

    public void print() {
        this.printNowSize();
        System.out.println(notes);

    }

    public String getNote( int index){
        return notes.get(index-1);
    }

    public static void main(String[] s) {
        Notes notes = new Notes();
        notes.SetArrayList(5, "xxxx");
        notes.print();
        notes.add(5, "5555");
        notes.print();
        notes.add(1, "1111");
        notes.print();
        notes.add(3, "3333");
        notes.print();

        System.out.println();
        System.out.println(notes.getNote(7));

    }


}

