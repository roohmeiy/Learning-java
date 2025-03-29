package practice;

public class Variables {
    int i=10;
    static int s=20;
    void sum(){
        int a=20;
        int sum= i+a;
        System.out.println("sum: " + s);
    }

    public static void main(String[] args) {
        Variables ob= new Variables();
        ob.sum();
        System.out.println(ob.i);
//        System.out.println(ob.s);
        System.out.println(Variables.s);
    }
}

