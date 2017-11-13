package TreeSetDemo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Stelawliet on 17/9/16.
 */
public class TestOut {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<Student>(new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                int num = s1.getScore() - s2.getScore();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("please enter the student info:");
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            studentTreeSet.add(new Student(strings[0], Integer.parseInt(strings[1])));
        }

        for (Student s : studentTreeSet) {
            System.out.println(s);
        }


    }
}
