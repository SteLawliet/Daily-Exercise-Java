package TreeSet2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class ChrTest {
    public static void main(String[] args) {
        System.out.println("please enter some chars:");
        Scanner scanner = new Scanner(System.in);
        String string0 = scanner.nextLine();
        char[] chars = string0.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        int i =1;
        for (char c : chars) {
            if(treeMap.containsKey(c)){
                treeMap.put(c,(treeMap.get(c)+1));

            }else {
                treeMap.put(c, i);
            }
        }
        Set<Map.Entry<Character, Integer> > me = treeMap.entrySet();
        for (Map.Entry<Character, Integer> s :me ){
            StringBuilder stringBuilder = new StringBuilder();
            String s1 = stringBuilder.append(s.getKey()).append("(").append(s.getValue()).append(")").toString();
            System.out.print(s1);
        }
    }
}
