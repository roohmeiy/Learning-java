package comparatorAndComparable;

public class Student2 {
    int rollno;
    String name;
    public Student2(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
