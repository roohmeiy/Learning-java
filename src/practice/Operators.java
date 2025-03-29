package practice;

public class Operators {
     void unaryOperators() {
        int a = 10, b = 20;
        System.out.println("Unary Plus: " + (+a));
        System.out.println("Unary Minus: " + (-a));
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));
        System.out.println("Pre-decrement: " + (--b));
        System.out.println("Post-decrement: " + (b--));
        boolean flag = true;
        System.out.println("Logical NOT: " + (!flag));
        System.out.println("Bitwise Complement: " + (a));
    }
     void assignmentOperators() {
        int a = 10;
        System.out.println("Initial value: " + a);
        a += 5;
        System.out.println("a += 5: " + a);
        a -= 3;  // a = a - 3
        System.out.println("a -= 3: " + a);
        a *= 2;  // a = a * 2
        System.out.println("a *= 2: " + a);
        a /= 4;  // a = a / 4
        System.out.println("a /= 4: " + a);
        a &= 6;  // a = a & 6
        System.out.println("a &= 6: " + a);
        a ^= 2;  // a = a ^ 2
        System.out.println("a ^= 2: " + a);
        a |= 1;  // a = a | 1
        System.out.println("a |= 1: " + a);
        a <<= 1; // a = a << 1
        System.out.println("a <<= 1: " + a);
        a >>= 2; // a = a >> 2
        System.out.println("a >>= 2: " + a);
        a >>>= 1; // a = a >>> 1
        System.out.println("a >>>= 1: " + a);
    }
    void relationalOperators() {
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }
    void instanceOfOperator() {
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }

    void bitwiseOperators() {
        int a = 5, b = 3;
        System.out.println("a & b: " + (a & b)); // 1 (AND)
        System.out.println("a | b: " + (a | b)); // 7 (OR)
        System.out.println("a ^ b: " + (a ^ b)); // 6 (XOR)
        System.out.println("~a: " + (~a)); // -6 (NOT)
    }
    void logicalOperators(){
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
    void ternaryOperator() {
        int a = 10, b = 20;
        int min = (a < b) ? a : b;
        System.out.println("Minimum value: " + min); // 10
    }
    public static void main(String[] args) {
        Operators ob1= new Operators();
        ob1.unaryOperators();
        ob1.assignmentOperators();
        ob1.relationalOperators();
        ob1.ternaryOperator();
        ob1.instanceOfOperator();
        ob1.bitwiseOperators();
        System.out.println("ob1 instanceof operators: "
                + (ob1 instanceof Operators));
        ob1.logicalOperators();
    }
}
