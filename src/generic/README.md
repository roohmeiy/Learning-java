# 🧠 Type Erasure in Java Generics

**Type Erasure** is a key concept behind how Java implements **generics**. When Java code is **compiled**, all generic type information is **removed** or "erased" by the compiler. This is done to maintain **backward compatibility** with older versions of Java that didn’t support generics (pre-Java 5).


> Type Erasure means that **generic types are replaced with raw types** during **compilation**, and the **type information is not available at runtime**.

---

### 🔍 How Type Erasure Works:

Suppose you write:

```java
List<String> list = new ArrayList<>();
list.add("hello");
```

➡️ After compilation, it becomes:

```java
List list = new ArrayList();
list.add("hello");
```

All type parameters (like `<String>`) are **erased**, and replaced with their **bound** (if any), or `Object` if there’s no bound.

### ✨ Example:

### With Generic:

```java
public class Box<T> {
    T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

```
### After Type Erasure (how the compiler sees it):

```java
public class Box {
    Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}
```

---

### 🎯 Why Type Erasure?

1. ✅ **Backward Compatibility**

    * Old Java code (pre-generics) still works with new code.
2. ✅ **No Generics Overhead at Runtime**

    * JVM doesn't need to know about generics.

