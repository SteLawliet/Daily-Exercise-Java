package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Stelawliet on 17/9/17.
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("001",1);
        hs.put("002",2);
        hs.put("003",3);
        hs.put("004",4);

        Set<Map.Entry<String,Integer>> entrySet= hs.entrySet();

        for (Map.Entry<String,Integer> me:entrySet) {
            String k = me.getKey();
            int v = me.getValue();
            System.out.println(k+"---"+v);
        }
        System.out.println("---------------");
       // Set<String> stringSet = hs.keySet();
        for (String s : hs.keySet()){
            System.out.println(s+"--------"+hs.get(s));
        }
        System.out.println(hs.containsKey(1));

    }


}

