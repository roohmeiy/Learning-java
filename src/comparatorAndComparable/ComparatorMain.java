package comparatorAndComparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {


        Student2 st1=new Student2(102,"pihu");
        Student2 st2=new Student2(101,"payal");
        Student2 st3=new Student2(104,"arun");
        Student2 st4=new Student2(103,"toffee");
//        TreeSet ts=new TreeSet(new RollSort());
        TreeSet ts=new TreeSet(new NameSort());
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
//        System.out.println(ts);

        ArrayList<Student2> al= new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        al.add(st4);
//        Collections.sort(al,new RollSort());
        Collections.sort(al,new NameSort());
        System.out.println(al);

    }
}
