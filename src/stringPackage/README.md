- String -> array of characters -> non-primitive DT
- if want to use string then there are 3 classes
    - java.lang.String ->immutable
    - java.lang.StringBuffer
    - java.lang.StringBuilder
  
- Creating String
    - String str=new String("Pihu); //creating string using new 
    - String str="Pihu" //creating string using string literal
      

### Step 1: **String Pool Check**
Each time `new String("Hello")` is executed, Java first checks the **String Pool**, a special memory area inside the **Heap**. The literal `"Hello"` is stored there if it doesn’t already exist.

Since `"Hello"` is a string literal, Java ensures that this exact sequence exists **only once** in the String Pool. Even if we create multiple `new String("Hello")`, all will use the same `"Hello"` from the String Pool for internal reference.

### Step 2: **Heap Memory Allocation**
Now, the **`new` keyword** forces Java to create a **new object** in the **Heap**, separate from the String Pool.
Each time `new String("Hello")` is used, Java:
1. **Finds `"Hello"` in the String Pool** (if not present, adds it there).
2. **Creates a new String object** in Heap Memory.
3. **Copies the reference of `"Hello"` from the String Pool** into this new object.

So, each of the four declarations:

```java
String a = new String("Hello");
String b = new String("Hello");
String c = new String("Hello");
String d = new String("Hello");
```

Results in **four separate objects** in the Heap, each holding `"Hello"`. However, they all refer back to the **same string `"Hello"` in the String Pool**.

### Step 3: **Comparisons in Memory**
- `a == b` → ❌ **False** (different objects in Heap)
- `a.equals(b)` → ✅ **True** (same content)
- `b == c` → ❌ **False** (different objects)
- `c == d` → ❌ **False** (different objects)

Even though all instances store `"Hello"`, **they are distinct objects in Heap memory**.

### How to Make Them Share the Same Reference?
If you want all four variables to refer **to the same object**, use **`.intern()`**, which forces Java to use the **String Pool** instead of creating new objects:

```java
String a = new String("Hello").intern();
String b = new String("Hello").intern();
String c = new String("Hello").intern();
String d = new String("Hello").intern();

System.out.println(a == b); // ✅ True (same reference)
System.out.println(c == d); // ✅ True (same reference)
```

### **Summary of Memory Structure**
#### **Heap (Objects in Memory)**
```
a --> [Hello] (New Object)
b --> [Hello] (New Object)
c --> [Hello] (New Object)
d --> [Hello] (New Object)
```
#### **String Pool (Shared Literal)**
```
"Hello" (Stored once and referenced by all heap objects)
```

Each `new String("Hello")` **creates a unique object in Heap**, though they all reference the **same string value in the String Pool**.
---
### why string ob are immutable
Reason | Benefit
Security | Prevents tampering with critical values
String Pooling | Saves memory & avoids duplicates
Thread Safety | No need for locks
HashCode Stability | Works reliably as Map key
Predictability | Clean and consistent behavior
---