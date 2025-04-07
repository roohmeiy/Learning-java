## Inheritance
Types of relationships:
- **IS-A**: Derived class is a type of base class (classic inheritance)
- **HAS-A**: Derived class contains an instance of base class as a member
- **USES-A**: Derived class uses a base class object within its functions

## Inheritance Alternative
- **Composition**: Building classes by combining objects of other classes instead of inheriting

## Object Class
- Parent class of all classes in Java
- If a class doesn't explicitly extend another class, it implicitly extends Object class

** Java does not support multiple inheritance and hybrid(also contains multiple inheritance- diamond problem) at the class level bcz of the ambiguity**
** cyclic inheritance is also not possible



# 9. Java Inheritance Documentation

## Overview
Java's inheritance model is designed to prevent ambiguity while providing powerful object-oriented capabilities. This document explains Java's inheritance rules, limitations, and the role of interfaces.

## Class-level Inheritance

### Restrictions

- **No Multiple Inheritance**: Java does not allow a class to extend multiple classes
- **No Hybrid Inheritance**: Java prohibits inheritance patterns that would involve multiple inheritance
- **No Cyclic Inheritance**: Classes cannot form circular inheritance relationships

### Inheritance Rules
- class from class - extends
- interface from interface- extends
- class from interface- implements
- interface from class - can't

## Interface Characteristics
- Interfaces do not have method bodies (except default methods in Java 8+)
- Variable declarations in interfaces are implicitly `public static final`
- Method declarations in interfaces are implicitly `public abstract`
- Interfaces are similar to abstract classes but traditionally contain no concrete methods

## The Diamond Problem
Java's prohibition of multiple inheritance prevents the "diamond problem" where ambiguity arises if a class inherits from two classes that both inherit from a common superclass. This can create conflicts when methods or fields have the same name in different parent classes.

## Best Practices
- Use interfaces to define contracts that multiple unrelated classes can fulfill
- Prefer composition over inheritance when possible
