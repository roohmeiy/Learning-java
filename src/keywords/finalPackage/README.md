- can't modify value of final variable
- can't inherit final class
- can't override final method

- You can use the `final` keyword with objects in Java, but it behaves differently compared to primitive types.

- **Final reference variable:** When you declare an object reference as `final`, it means that the reference **cannot be changed** to point to another object. However, the **contents** of the object can still be modified.

  ```java
  class Test {
      int x = 10;
  }

  public class Main {
      public static void main(String[] args) {
          final Test obj = new Test();
          obj.x = 20; // Allowed
          // obj = new Test(); // Error: Cannot assign a new object to a final reference or obj=obj2;
  


          System.out.println(obj.x); // Prints 20
      }
  }
  ```

- **Immutable objects:** If you want to make an object **truly immutable**, you should ensure that all of its fields are `final` and prevent external modification by making them private and not providing setters.

  ```java
  class ImmutableTest {
      private final int x;

      public ImmutableTest(int x) {
          this.x = x;
      }

      public int getX() {
          return x;
      }
  }
  ```

Even though `final` prevents reassigning the reference, it does not make the object itself immutable. You need additional measures to achieve true immutability.


