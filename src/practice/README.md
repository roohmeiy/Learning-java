# Java Programming Concepts

## 1. Pass by Value
- Java only supports pass by value
- This means when methods are called, a copy of the value is passed, not the original reference

## 2. Object Creation Syntax
```java
Main m = new Main();
```
Breaking down the syntax:
- `Main`: Class name
- `m`: Object reference
- `new`: Keyword to create a new instance
- `Main()`: Constructor call

## 3. Type Checking and Casting
### Type Checking
- Performed by the compiler
- Ensures type compatibility at compile-time

### Type Casting
- Performed by the JVM
- Two types of casting:
    1. Widening (Implicit Casting)
        - Conversion from lower data type to higher data type
        - Automatically done by the compiler
        - Example: `int` to `long`

    2. Narrowing (Explicit Casting)
        - Conversion from higher data type to lower data type
        - Requires explicit casting by the programmer
        - Example: `long` to `int`

## 4. Variables in Java

### Local Variables
- Declared inside method, constructor, or block
- Stored in the stack
- No default value
- Exist only while the method is being executed

### Instance Variables
- Declared outside methods, at the class level
- Stored in the heap when an object is created
- Can be used anywhere within the class (except static methods)
- Have default values based on their type

### Static Variables
- Declared with `static` keyword
- Stored in the method area
- Loaded when the class is loaded by the JVM
- Can be accessed without creating an object

## 5. JVM Memory Areas
1. **Program Counter (PC) Register**
    - Stores the address of the current instruction being executed
    - Keeps track of the next instruction to be processed
    - Specific to each thread in the Java Virtual Machine (JVM)

2.  **Method Area (part of JVM memory)**
- Stores class-level data: class names, static variables, method info, and constant pool.
- Shared among all threads in the JVM.
- Loaded when the class is first referenced.
- It's part of the JVM’s heap-like memory structure but is logically separate.

3. **Native Method Area (aka Native Method Stack)**
- Used for executing native (non-Java) methods written in C/C++ via JNI (Java Native Interface).
- Stores data related to native calls and their execution environment.
- Managed separately by the JVM depending on the platform.
- Not directly manipulated by Java code—used internally by JVM.

4. **Heap**
    - Runtime data area where objects are stored
    - Shared among all threads

5. **Stack**
    - Stores local variables and method call information
    - Each thread has its own stack


### **Why Java is not fully OOP?**
1. **Primitive Data Types:**
    - Java uses primitives (`int`, `double`, `char`, etc.) for performance optimization.
    - True OOP languages treat **everything** as an object, but Java allows both objects and primitives.

2. **Static Methods:**
    - Static methods in Java belong to a class, not an object.
    - In pure OOP, behavior is always tied to objects.

3. **Wrapper Classes Exist:**
    - Java provides wrapper classes (`Integer`, `Double`, `Boolean`, etc.) to convert primitives into objects.
    - Example: `Integer x = new Integer(10);` converts primitive `int` into an object.

4. **Main Method is Not an Object’s Method:**
    - `public static void main(String[] args)` is required to start execution, but it's static—meaning it **does not belong to an instance (object).**

### **Is Java still Object-Oriented?**
Yes! Java **follows almost all** OOP principles: **Encapsulation, Inheritance, Polymorphism, and Abstraction.** It’s highly object-focused, but **not purely OOP** because of primitives and static elements.

