package collection.mapEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Integer[] a = {10, 10, 80, 80, 80, 60, 40};
//        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Integer element=null;
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 ) {
                element = entry.getKey();
                break;
            }
        }
        System.out.println("FirstNonRepeatingElement " + element);
    }
}
