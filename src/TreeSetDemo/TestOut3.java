package TreeSetDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class TestOut3 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i <4 ; i++)

        {
            System.out.println("please enter  the student info:");
            String str = scanner.nextLine();
            String[] strings =  str.split(" ");
            students.add(new Student(strings[0], Integer.parseInt(strings[1])));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getScore() - o2.getScore();
                return i;
            }
        });
        for (Student s:students) {
            System.out.println(s);
        }


    }
}
