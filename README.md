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

2. **Native Method Area**
    - Supports native method execution

3. **Method Area**
    - Allows execution of code written in other programming languages
    - Supports integration of non-Java code (e.g., C, C++) within Java applications
    - Enables interfacing with system-level libraries and platform-specific functionalities


4. **Heap**
    - Runtime data area where objects are stored
    - Shared among all threads

5. **Stack**
    - Stores local variables and method call information
    - Each thread has its own stack

## 6. Class Types

### POJO (Plain Old Java Object) Class
- Simple Java class with minimal restrictions
- No special constraints or dependencies
- Not inherently compatible with specific frameworks
- Typically used for basic data representation

### Bean Class
#### Data Components
- **Data Part**:
    - Private variables for data encapsulation
    - Access controlled through specific methods

- **Getter Methods**:
    - Used to retrieve values of private variables
    - Provide controlled access to class data

- **Setter Methods**:
    - Used to initialize or modify values of private variables
    - Provide controlled way to set class data

#### Characteristics
- Public getter and setter methods
- No parameterized constructors
- Follows standard Java Bean conventions

## 7. Object-Oriented Programming Concepts

### Encapsulation
- Mechanism of data hiding
- Achieved using private modifiers
- Combines two key principles:
    1. Data Hiding
    2. Abstraction

### Abstraction
- Achieved through:
    - Abstract classes
    - Interfaces
- Hides implementation details
- Provides a simplified view of complex systems

#### Types of Methods
- **Concrete Method**: Regular method with complete implementation
- **Abstract Method**:
    - Declared with `abstract` keyword
    - No method body
    - Must be implemented by child classes

### Abstract Class
- Defined using the `abstract` keyword
- Can contain both abstract and concrete methods
- Cannot be instantiated directly
- Used as a base for inheritance

## Two ways to achieve abstraction
- **Interface** (better)
- **Abstract class**
    - If a class is abstract, it is not mandatory that it consists of abstract functions
    - But if a class has an abstract method, the class must be an abstract class
    - It is mandatory for derived classes to provide method bodies for abstract functions

## 8. Constructors (to initialize values)
- **Default constructor**
    - Created by compiler
    - Initializes variables to default values
    - Default constructor will be called only if programmer didn't write any other constructor
    - Only one line of code using super keyword
    class

- **Parameterized constructor** - created by programmer
- **No-arg/zero-arg constructor** - created by programmer

  ***[Same access modifier as the class]***

## Differences between Constructors and Methods

| Constructor                                                             | Method |
|-------------------------------------------------------------------------|--------|
| Same name as class                                                      | No constraints on naming |
| No return type                                                          | Has return type |
| Called manually                                                         | Created automatically |
| Can't be inherited (bcz it is not a part of class)                      | Can be inherited |
| Used to initialize values                                               | Used to perform tasks |
| Default constructor provided by compiler if no other constructor exists | No default method provided |