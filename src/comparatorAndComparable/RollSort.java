package comparatorAndComparable;


import java.util.Comparator;

public class RollSort implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        Integer i1 = o1.rollno;
        Integer i2 = o2.rollno;
        return i1.compareTo(i2);
    }
}
