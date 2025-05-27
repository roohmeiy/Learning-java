package generic;

public class Student implements Comparable{
//    int rollno;
    Integer rollno;
    String name;
    public Student(Integer rollno, String name){
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
    @Override
    public int compareTo(Object ob){
        Student st=(Student)ob;
//        return this.name.compareTo(st.name);

        /*
        Integer r1=this.rollno;
        Integer r2=st.rollno;
        return r1.compareTo(r2);

         */

        return  this.rollno.compareTo((st.rollno));
    }
}
