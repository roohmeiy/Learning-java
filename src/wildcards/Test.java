package wildcards;

import comparatorAndComparable.SortByLength;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new SortByLength());
        ts.add("AAAA");
        ts.add("BBB");
        ts.add("AAA");
        ts.add("BB");
        ts.add("AA");
        ts.add("A");
        ts.add("B");

        System.out.println(ts);
    }

}
