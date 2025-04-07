- Interface is just like a class, which contains only abstract methods. To achieve interface java provides keyword 'implements'.
- By default var in interface- public static final
- By default method in interface - public abstract
(interface similar to abstract classes but it doesn't contain concrete methods)
- Interface method must be defined inside the implementing classes
- Interface is nothing, but contract between client and developer
- Used to define the requirements of the client and provide contract with the developer.
- Create interface in java to handle client requirements for i/o operations.
- We can't make object of abstract class and interface but can make reference variable

  ```java
  interfaceName refVar =new Class();
  ```


## Why we use interface
- multiple inheritance
- to achieve loose coupling
- to achieve full abstraction

## Benefits of Interfaces
1. Multiple Inheritance possible
2. **Loose Coupling**: Interfaces reduce dependencies between components
3. **Full Abstraction**: Interfaces provide complete abstraction by hiding implementation details
4. Loose coupling

## Can a class inherit from an interface in Java?

- No, a class cannot inherit from an interface. Instead, a class implements an interface.

### Why?
- Inheritance (extends) is used to acquire properties and behaviors from a parent class.
- Interfaces only provide rules (method declarations) but don’t define how those methods work.
- A class must implement all methods of an interface and give them functionality.

## Marker interface 
- doesn't contain any abstract method or var
- used to provide extra feature or abilities to object at run time 
-  ```java
    interface {
    }  
   ```
- ex->
1. Cloneable Interface
   - Purpose: To create exact copies of objects (cloning).
   - Package: java.lang.Cloneable
   - Note: If you don’t implement Cloneable, calling clone() throws CloneNotSupportedException.

2. Serializable Interface
   - Purpose: To save object state to a file or send it over a network (object serialization).
   - Package: java.io.Serializable
   - Usage: Implement this interface to make objects serializable (no methods to implement).
   - Note: Used with ObjectOutputStream and ObjectInputStream.

3. Remote Interface
   - Purpose: Used in Java RMI (Remote Method Invocation) to call methods from one JVM to another over a network.
   - Package: java.rmi.Remote
   - Usage: Any remote object must implement Remote and extend UnicastRemoteObject. 
   - Note: All methods in the interface must throw RemoteException.
