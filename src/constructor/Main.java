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

        //copy
        Color color= new Color("Blue");
        Pen pen1= new Pen("Parkar", color);
        Pen pen2= new Pen(pen1);
        System.out.println("values using ob1 ");
        System.out.println("pen1 brand:" +pen1.brand);
        System.out.println("pen1 color:" + pen1.color.color); //pen1.color-> This refers to the color attribute of the Pen object (pen1). and pen1.color.color-> refers to the actual string value stored inside the Color class
        System.out.println("values using ob2 ");
        System.out.println("pen2 brand:" +pen2.brand);
        System.out.println("pen2 color:" + pen2.color.color);
        System.out.println("modifying color of pen1 ");
        pen1.color.color="lavender";
        System.out.println("pen1 color:" +pen1.color.color);
        System.out.println("pen2 color:" +pen2.color.color);


    }
}
