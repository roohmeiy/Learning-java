package practice;

    class Student {
    private int age;
    private String name;

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student std = new Student();

        // Setting values using setters
        std.setAge(20);
        std.setName("Payal");
        System.out.println("Name: " + std.getName());
        System.out.println("Age: " + std.getAge());
    }
}
