package generic;

import java.util.Comparator;

public class NameSort implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        String s1 = o1.name;
        String s2 = o2.name;
        return s1.compareTo(s2);
    }
}
