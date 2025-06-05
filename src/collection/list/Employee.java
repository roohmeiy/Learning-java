package collection.list;

public class Employee {
    int age;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    Employee(int age, String name){
        this.age=age;
        this.name=name;
    }
}
//call is in ArrayListDemo