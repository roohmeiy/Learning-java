package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

// all wrapper classes and string inherits comparable interface
public class ComparableMain {
    public static void main(String[] args) {

        Student s1=new Student(103,"Pihu");
        Student s2=new Student(101, "Payal");
        Student s3=new Student(104, "Arun");
        Student s4=new Student(102, "Shady");

        ArrayList<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

//        Collections.sort(al);
//        System.out.println(al);

        TreeSet<Student> ts= new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
