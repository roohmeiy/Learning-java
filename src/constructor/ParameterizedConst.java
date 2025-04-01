package constructor;

public class ParameterizedConst {
    String name;
    int age;
    ParameterizedConst(String name, int age) {
        System.out.println("Output by parameterized constructor");
        this.name = name;
        this.age= age;
    }
}
