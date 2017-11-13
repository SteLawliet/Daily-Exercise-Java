package Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = Integer.parseInt(o1)-Integer.parseInt(o2);
                return num;
            }
        });
        treeMap.put("11","dfdss");
        treeMap.put("2","nnnnn");
        treeMap.put("3","ssss");
        treeMap.put("64","ssdads");

        Set<String> stringSet = treeMap.keySet();

        for (String s : stringSet){

            System.out.println(s+"------"+treeMap.get(s));
        }

    }
}
