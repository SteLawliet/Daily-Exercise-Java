package TreeSet2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class PokerTest {
    public static void main(String[] args) {
        HashMap<Integer, String> pokers = new HashMap<Integer, String>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>();
        String[] colors = {"♦", "♥", "♣", "♠"};
        String[] scores = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] king = {"BigKing", "SmallKing"};

        int Index = 0;
        for (String score : scores) {
            for (String color : colors) {
                StringBuilder sb = new StringBuilder();
                pokers.put(Index, sb.append(score).append(color).toString());
                arrayList.add(Index);
                Index++;
            }
        }
        pokers.put(52, king[0]);
        arrayList.add(52);
        pokers.put(53, king[1]);
        arrayList.add(53);


        Set<Integer> integerSet = pokers.keySet();
        int x = 0;
        for (Integer i : integerSet) {
            String s = pokers.get(i);
            System.out.print(s);
            System.out.print(" ");
            x++;
            if (x % 13 == 0) {
                System.out.println();
                System.out.println("-----------------------------------");
            }
        }
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        Collections.shuffle(arrayList);
        TreeSet<Integer> one = new TreeSet<>();
        TreeSet<Integer> two = new TreeSet<>();
        TreeSet<Integer> three = new TreeSet<>();
        TreeSet<Integer> four = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {


            if (i >= arrayList.size() - 3) {
                four.add(arrayList.get(i));
            } else if (i % 3 == 0) {
                one.add(arrayList.get(i));
            } else if (i % 3 == 1) {
                two.add(arrayList.get(i));
            } else if (i % 3 == 2) {
                three.add(arrayList.get(i));
            }

        }

        getTree(one);
        getTree(two);
        getTree(three);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        getPi(one, pokers);
        getPi(two, pokers);
        getPi(three, pokers);
        getPi(four, pokers);

    }

    static void getPi(TreeSet<Integer> ts, HashMap<Integer, String> pokers) {
        for (Integer i : ts) {
            String s = pokers.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
    }

     static void getTree(TreeSet<Integer> ts) {
        for (Integer i : ts) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
    }


}

