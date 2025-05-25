package collection.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Pihu");
        hm.put(102, "ffff");
        hm.put(103, "fgfd");
        hm.put(104, "fdd");
        hm.put(105, "fgsds");
        System.out.println(hm.get(104));
        System.out.println(hm.remove(104));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey(105));
        System.out.println(hm.containsValue("ffff"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println("---------------------------------------");
//        for(Object i: hm.entrySet())
//            System.out.println(i);
        for(Map.Entry entry : hm.entrySet())
            System.out.println("Key: "+ entry.getKey() + " Value: " + entry.getValue());

    }
}