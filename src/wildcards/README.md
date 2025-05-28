# 🎯 What are Wildcards?

**Wildcards** are special symbols (`?`) used in generics to represent **unknown types**. They make your code more flexible when you don’t know the exact generic type but want to work with a family of related types.


### Types of Wildcards:

### 1. **Unbounded Wildcard `<?>`**

* Represents **any type**.
* Used when you don’t care about the exact type.
* Mostly for **read-only** operations (you can’t add to the collection safely).

**Example:**

```java
public void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
```

You can pass `List<String>`, `List<Integer>`, etc.

---

### 2. **Upper Bounded Wildcard `<? extends T>`**

* Represents **T or any subclass of T**.
* You can **read** from the collection safely as `T`, but **cannot add** to it (except null).
* Useful for **covariance** (you want to accept subclasses).

**Example:**

```java
public double sumNumbers(List<? extends Number> list) {
    double sum = 0.0;
    for (Number n : list) {
        sum += n.doubleValue();
    }
    return sum;
}
```

You can pass `List<Integer>`, `List<Double>`, etc., because both extend `Number`.

---

### 3. **Lower Bounded Wildcard `<? super T>`**

* Represents **T or any superclass of T**.
* You can **add** objects of type T or its subclasses to the collection.
* Useful for **contravariance** (you want to write to the collection).

**Example:**

```java
public void addIntegers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}
```

You can pass `List<Integer>`, `List<Number>`, or `List<Object>`.

---

### 📌 Quick Summary Table

| Wildcard        | Meaning                | You can…      | Example Use Case              |
| --------------- | ---------------------- | ------------- | ----------------------------- |
| `<?>`           | Any type               | Read only     | Printing elements of any list |
| `<? extends T>` | T or subclasses of T   | Read as T     | Reading numbers to sum        |
| `<? super T>`   | T or superclasses of T | Add T objects | Adding Integers to a list     |

---

## Why use Wildcards?

* They increase **flexibility** in method parameters.
* Allow methods to work with a **range of types**, not just one.
* Helps **avoid casting** and unsafe operations.
