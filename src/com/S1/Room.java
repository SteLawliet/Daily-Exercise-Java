package com.S1;

import java.util.ArrayList;

/**
 * Created by zhaoziqi on 17/6/12.
 */
public class Room {
    private int i;
    private String note;
    ArrayList<String> notes = new ArrayList<String>();
    public void Room(int i,String note ){
        notes.add(i,note);

    }
    public void addDoor(int index,String info){
        notes.add(index,info);
    }
    public void print(){
        System.out.println(notes);
    }
    public static void main (String[] s){
        String a = "ssssss";
        Room room = new Room();
        room.Room(0,a);
    }
}
