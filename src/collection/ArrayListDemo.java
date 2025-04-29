package collection;

import com.anudip.learning.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println();
        for (Object x : list)
            System.out.println(x);

        List list2 = new ArrayList();
        list2.add("el1");
        list2.add("el2");
        list2.add("el3");
        list2.add(20);
        list2.add("el4");
        list2.add("el5");

        System.out.println(list2);
        System.out.println();

        list2.add(4, "el8");
        System.out.println(list2);
        System.out.println();

        list2.remove("el3");
        System.out.println(list2);
        System.out.println();

        list2.remove(4);
        System.out.println(list2);
        System.out.println();

        list2.remove(Integer.valueOf(20));
        System.out.println(list2);
        System.out.println();

        list2.set(1,"el3");
        System.out.println(list2);
        System.out.println();

        int pos= list2.indexOf("el8");
        System.out.println(pos);
        System.out.println();

        String str= (String)list2.get(2);
        System.out.println(str);
        System.out.println();

        System.out.println(list2.size());
        System.out.println();

        System.out.println(list2.contains("el"));
        System.out.println();

        list2.clear();
        System.out.println();


        Employee e1= new Employee(20,"Pihu");
        Employee e2= new Employee(26,"arun");
        Employee e3= new Employee(27,"shin");
        Employee e4= new Employee(28,"AAnchu");

        ArrayList <Employee> emp = new ArrayList();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        System.out.println(emp);


    }
}