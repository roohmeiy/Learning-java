##  Constructors (to initialize values)
- **Default constructor**
    - Created by compiler
    - Initializes variables to default values
    - Default constructor will be called only if programmer didn't write any other constructor
    - Only one line of code - super();
    - A constructor can call another constructor within the same class using the this() keyword. This is called constructor chaining.
    - [Same access modifier as the class] - can't be pvt or protected bcz outer classes cannot be private or protected

- **Parameterized constructor** - created by programmer
- **No-arg/zero-arg constructor** - created by programmer



## Differences between Constructors and Methods

| Constructor                                                             | Method |
|-------------------------------------------------------------------------|--------|
| Same name as class                                                      | No constraints on naming |
| No return type                                                          | Has return type |
| Called manually                                                         | Created automatically |
| Can't be inherited (bcz it is not a part of class)                      | Can be inherited |
| Used to initialize values                                               | Used to perform tasks |
| Default constructor provided by compiler if no other constructor exists | No default method provided |

# Object-Oriented Programming Concepts

## Copy Constructor
- **Shallow Copy**: Passes memory location (reference) of the original object
- **Deep Copy**: Creates and passes a completely new copy of the original object
