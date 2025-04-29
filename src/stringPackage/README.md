- String -> array of characters -> non-primitive DT
- if want to use string then there are 3 classes
    - java.lang.String ->immutable
    - java.lang.StringBuffer -> mutable -> we don't use this --> all functions are synchronized  ---> thread safe --> slow application performance
    - java.lang.StringBuilder -> mutable --> same functions as stringbuilder --> all functions -> not synchronized  ---> mot thread safe  ---> fast application performance
    - stringbuffer from starting and stringbuilder in v1.5
- Creating String
    - String str=new String("Pihu); //creating string using new 
    - String str="Pihu" //creating string using string literal

- equals fun= object class fun which check reference but string class override  the equals fun, so it checks content

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

## 🔍 What is **Regex** (Regular Expression)?

> **Regex** is a **pattern** that you use to **search**, **match**, or **replace** text — like words, numbers, characters, or combinations.

It's like giving Java a **formula** for what to look for in a string.

---

## 📌 Why Use Regex?

You use regex when you want to:
- Validate input (e.g. email, password)
- Find patterns in text (e.g. digits, words)
- Replace parts of strings in a smart way

---

## 🧪 Basic Regex Patterns

| Pattern      | Meaning                            | Example Match                |
|--------------|-------------------------------------|------------------------------|
| `.`          | Any single character                | `a.c` → matches "abc", "axc" |
| `\d`         | Any digit (0-9)                     | `\d` → "3", "9"              |
| `\D`         | Any non-digit                       |                              |
| `\w`         | Word character (a-z, A-Z, 0-9, _)   |                              |
| `\s`         | Whitespace (space, tab, newline)    |                              |
| `+`          | One or more                        | `\d+` → matches "123", "5"   |
| `*`          | Zero or more                        |                              |
| `^`          | Start of line                       | `^Hello` → matches if line starts with "Hello" |
| `$`          | End of line                         | `world$`                     |
| `[]`         | Range of characters                 | `[a-z]` → any lowercase letter |
| `|`          | OR                                  | `cat|dog` → "cat" or "dog"   |

---

## 💡 Example in Java:

```java
String str = "abc123xyz456";

// Replace all digits with #
str.replaceAll("\\d", "#");  
// Output: "abc###xyz###"
```

> `\\d` → matches any digit  
> `replaceAll()` → replaces **all** digits

---

### Validate Email

```java
String email = "payal@example.com";
boolean isValid = email.matches("[a-zA-Z0-9._%+-]+@[a-z]+\\.[a-z]{2,}");
System.out.println(isValid); // true ✅
```
substring() → Returns a String (most commonly used).

subSequence() → Returns a CharSequence (useful for polymorphism).

Functionally identical in behavior but differ in return type.

---

# **String Arrays vs Character Arrays in Java**

## **1. Character Arrays (`char[]`)**
A character array is a sequence of primitive `char` values.

### **Declaration & Initialization**
```java
// Method 1: Declaration then initialization
char[] charArray1 = new char[5]; // Creates array with 5 empty slots
charArray1[0] = 'J';
charArray1[1] = 'A';
charArray1[2] = 'V';
charArray1[3] = 'A';

// Method 2: Direct initialization
char[] charArray2 = {'J', 'A', 'V', 'A'};
```

### **Key Features**
- Stores **primitive** `char` values
- **Mutable** (contents can be changed)
- **Faster** for low-level operations
- Fixed length after creation

### **Common Operations**
```java
char[] chars = {'H', 'e', 'l', 'l', 'o'};

// Access elements
char first = chars[0]; // 'H'

// Modify elements
chars[0] = 'h'; // Now {'h', 'e', 'l', 'l', 'o'}

// Convert to String
String str = new String(chars); // "hello"

// Length
int length = chars.length; // 5
```

### **When to Use**
- When you need to **modify individual characters**
- For **low-level string manipulation**
- When working with **I/O operations** (e.g., reading files)

---

## **2. String Arrays (`String[]`)**
A string array stores references to `String` objects.

### **Declaration & Initialization**
```java
// Method 1: Declaration then initialization
String[] strArray1 = new String[3];
strArray1[0] = "Java";
strArray1[1] = "Python";
strArray1[2] = "C++";

// Method 2: Direct initialization
String[] strArray2 = {"Apple", "Banana", "Orange"};
```

### **Key Features**
- Stores **objects** (instances of `String`)
- **Immutable** elements (individual strings can't be modified)
- Flexible for storing multiple strings
- Supports all `String` methods

### **Common Operations**
```java
String[] languages = {"Java", "Python", "JavaScript"};

// Access elements
String first = languages[0]; // "Java"

// Length
int length = languages.length; // 3

// Join into single string
String joined = String.join(", ", languages); // "Java, Python, JavaScript"

// Modify array (but not string contents)
languages[1] = "C++"; // Now {"Java", "C++", "JavaScript"}
```

### **When to Use**
- When storing **multiple strings** (e.g., names, file paths)
- For **higher-level string operations**
- When working with **collections** or **APIs** that expect strings

---

## **Key Differences**
| Feature          | `char[]`                          | `String[]`                        |
|------------------|----------------------------------|----------------------------------|
| **Type**         | Primitive array                  | Object array                     |
| **Mutability**   | Elements can be modified         | Array can be modified, but strings are immutable |
| **Memory**       | More memory-efficient            | Less efficient (stores objects)  |
| **Usage**        | Character-level manipulation     | String-level operations          |
| **Example**      | `{'H','e','l','l','o'}`          | `{"Hello", "World"}`             |

---

## **Conversion Between Them**
### **1. String → char[]**
```java
String str = "Hello";
char[] chars = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o'}
```

### **2. char[] → String**
```java
char[] chars = {'W', 'o', 'r', 'l', 'd'};
String str = new String(chars); // "World"
```
### toString
- we use when we want to convert stringbuilder ob into string
- when we want to print details of ob rather than hash value

## **Summary**
- **Use `char[]`** when you need to:
  - Modify individual characters
  - Work with low-level text processing
- **Use `String[]`** when you need to:
  - Store multiple strings
  - Use high-level string operations
