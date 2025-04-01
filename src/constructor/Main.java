package constructor;

public class Main {
    public static void main(String[] args) {
        //default constructor
        DefaultConst dc= new DefaultConst();
        dc.name="Pihu";
        dc.age=20;
        System.out.println(dc.name);
        System.out.println(dc.age);

        // no argument constructor
        ZeroArgument zc= new ZeroArgument();

        //parameterized constructor
        ParameterizedConst pc= new ParameterizedConst("Payal", 20);
        System.out.println(pc.name);
        System.out.println(pc.age);

    }
}
