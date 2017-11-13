package com.S1;

import java.util.HashMap;

/**
 * Created by zhaoziqi on 17/6/12.
 */
public class Hash {


    private HashMap<String, Room > map = new HashMap< String,Room>() ;

    public void setMap(String s, Room room) {
        map.put(s,room);
    }

    public static void main(String[] strings){
        Room room_1 = new Room();
        room_1.Room(0,"0000");
        room_1.addDoor(1,"0000");
        room_1.addDoor(2,"0000");
        room_1.addDoor(1,"x");
        room_1.print();
        Room room_2 = new Room();
        room_2.Room(0,"1111");
        room_2.addDoor(1,"2222");
        room_2.print();
        Hash hash = new Hash();
        hash.setMap("1",room_1);
        hash.setMap("2",room_2);
        System.out.println(hash.toString());

    }
}
