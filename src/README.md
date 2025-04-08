### 🎯 **Upcasting example:**

You have two classes:

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

Now here’s the line:
```java
Animal a = new Dog(); // 👈 This is upcasting!
```

---

### 🧠 What is Upcasting?

👉 Upcasting means:
> **Storing a child class object (`Dog`) in a parent class reference (`Animal`).**

Like this:
```
Child --> Parent
Dog   --> Animal
```

So this line:
```java
Animal a = new Dog();
```
is saying:
> “I’ll create a `Dog` object, but I’ll treat it like a generic `Animal`.”

---

### 📌 But Why??

Because now you can do things like this:

```java
void makeItSound(Animal a) {
    a.sound(); // Will call Dog's sound() if Dog is passed
}
```

And call it like:
```java
makeItSound(new Dog()); // Output: Dog barks
```

So you can pass **any Animal**—Dog, Cat, Lion—and it will work.  
This is called **runtime polymorphism**.

---

### 🔍 What does upcasting look like in real life?

Imagine:

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat eats fish");
    }
}
```

Then this code:

```java
Animal a = new Cat(); // upcasting
a.eat(); // Output: Cat eats fish
```

Even though `a` is of type `Animal`, it runs the `Cat` version of `eat()` at runtime.

Because behind the scenes, Java knows the real object is a `Cat`.

---


### ✅ Summary

| Concept        | Meaning |
|----------------|---------|
| **Upcasting**  | Child class object → Stored in parent class reference |
| **Why use it?** | So we can write generic, flexible code |
| **Benefit**    | Enables **runtime polymorphism** (right method is called at runtime) |

---

# ✅ **Access Specifier Table**

| **Context**                | **Default Access**         | **Possible Access Specifiers**                                 | **Notes**                                                                 |
|----------------------------|-----------------------------|------------------------------------------------------------------|----------------------------------------------------------------------------|
| **Class**                  | `default`                  | `public`, `default`                                              | Cannot be `private` or `protected`                                        |
| **Class Variable**         | `default`                  | `private`, `protected`, `public`, `default`                      |                                                                            |
| **Class Method**           | `default`                  | `private`, `protected`, `public`, `default`                      |                                                                            |
| **Abstract Class**         | `default`                  | `public`, `default`                                              | Cannot be `private` or `protected`                                        |
| **Abstract Class Variable**| `default`                  | `private`, `protected`, `public`, `default`                      | Same rules as normal class variables                                      |
| **Abstract Method**        | N/A                        | `public`, `protected`, `default`                                 | ❌ Cannot be `private` or `static`                                        |
| **Interface Variable**     | `public static final`      | **Only** `public static final`                                   | Always constant and accessible globally                                   |
| **Interface Method**       | `public abstract`          | `public abstract`, `public default`, `public static`             | All must be `public`                                                      |
| **Inheritance Access**     | N/A                        | `public`, `protected`, `default`                                 | `private` members are **not inherited**, `default` inherited in same pkg  |

---

### 👇 Summary of **Inheritance Behavior by Access Modifier**:

| **Access Modifier** | **Is Inherited?**          | **Scope**                                       |
|---------------------|----------------------------|-------------------------------------------------|
| `public`            | ✅ Yes                     | Everywhere                                      |
| `protected`         | ✅ Yes                     | Same package + subclasses (even in other pkgs) |
| `default`           | ✅ Yes                     | Only in **same package**                        |
| `private`           | ❌ No                      | Not inherited at all                           |



