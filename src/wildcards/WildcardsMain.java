package wildcards;
import java.util.*;

public class WildcardsMain {
    public static void main(String[] args) {

        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        printList(al);
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
