# Abstraction
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
- In Java, when a class inherits from an abstract class, it has two choices:
    - Implement all abstract methods – If the subclass is a regular (concrete) class, it must provide implementations for all abstract methods of the abstract parent class.
    - Remain abstract – If the subclass doesn't implement all abstract methods, it must itself be declared as abstract, and then its own subclasses must provide implementations for the remaining abstract methods.

## Two ways to achieve abstraction
- **Interface** (better)
- **Abstract class**
    - If a class is abstract, it is not mandatory that it consists of abstract functions
    - But if a class has an abstract method, the class must be an abstract class
    - It is mandatory for derived classes to provide method bodies for abstract functions
    - We can't make objects of abstract class and interface


Java is **not 100% Object-Oriented Programming (OOP)** because it includes some **primitive data types** (like `int`, `char`, `boolean`, etc.), which are **not objects**.
