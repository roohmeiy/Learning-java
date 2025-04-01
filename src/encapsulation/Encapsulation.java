package encapsulation;
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


