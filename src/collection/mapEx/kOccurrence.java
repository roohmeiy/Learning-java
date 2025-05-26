package collection.mapEx;
import java.util.HashMap;
import java.util.Map;

public class kOccurrence {
    public static void main(String[] args) {
        Integer[] a = {0,1,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer b=2;
        Integer result=0;

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        if(! map.containsValue(b)){
            result=-1;
        }
        else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(b)) {
                    result += entry.getKey();
                }
            }
        }

        System.out.println(result);
    }
}

