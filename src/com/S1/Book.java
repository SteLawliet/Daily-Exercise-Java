package com.S1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zhaoziqi on 17/6/12.
 */
public class Book {
    private HashMap<String,Notes > mBook = new HashMap< String,Notes>();

    public void AddmBook(String index,Notes notes ) {
        mBook.put( index,notes);
    }
    public void print(String s){
        mBook.get(s).print();
    }


    public static void main(String[] s){
        Notes notes_1 = new Notes();
        notes_1.SetArrayList(4, "xxxx");
        Book book = new Book();
        book.AddmBook("first",notes_1);
        book.print("first");
        System.out.println("please enter the notes:");
        Notes notes_2 = new Notes();
        book.AddmBook("second",notes_2);

        Scanner in = new Scanner(System.in);
        String no = in.nextLine();
        notes_2.SetArrayList(4, no);
        book.AddmBook(no,notes_2);
        book.print(no);
    }
}
