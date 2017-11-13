package TreeSetDemo;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class TestOut2 {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<Student>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("please enter the student  info:");
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            studentTreeSet.add(new Student(strings[0], Integer.parseInt(strings[1])));
        }

        for (Student s : studentTreeSet) {
            System.out.println(s);
        }


    }
}
