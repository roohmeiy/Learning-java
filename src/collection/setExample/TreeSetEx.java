package collection.setExample;
import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        NavigableSet ns=new TreeSet();
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        System.out.println(ns.descendingSet());
        System.out.println(ns.ceiling(3)); //> or == first pref equal
        System.out.println(ns.higher(3));//find immediate higher
        System.out.println(ns.ceiling(6));
        System.out.println(ns.higher(5));
        System.out.println(ns.floor(3)); //> or == first pref equal
        System.out.println(ns.lower(3));//find immediate lower
    }
}
