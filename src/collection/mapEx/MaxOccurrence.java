package collection.mapEx;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurrence {
    public static void main(String[] args) {
        Integer[] a = {10, 10, 80, 80, 80, 60, 40};
        HashMap<Integer, Integer> max = new HashMap<>();
        int maxCount = 0;
        Integer maxElement = null;

        for (int i = 0; i < a.length; i++) {
            if (max.containsKey(a[i]))
                max.put(a[i], max.get(a[i]) + 1);
            else
                max.put(a[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : max.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("max occurred element is " + maxElement + " and number of time it occurred is " + maxCount);
    }
}
