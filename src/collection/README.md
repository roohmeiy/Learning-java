- map is not a part of collection but it is a part of collection framework
- framework -library that contains classes and interfaces
- collection- data is stored directly
- map- key value pairs
- collection framework -> It is an API which contains predefines class and interface
- collection(interface) -> It is the root interface (in java.util.package) of all the collection objects.
- collection(s)(utility class)-> contains only static methods ->can't create objects
- restrict object creation -> make constructor private
- arraylist- only object-----------------no fix size ----------lessfast------- memory less----- hetero ------------generic ---------------------- inherit list interface
- array-  primitive& non primitive-----fix size -------------more fast ------memory more ----- homo-------------- specified----------------------inherit object  class

- Iterable contains 1 method- iterator();
  - java.lang.Iterable

- iterator method is of iterable interface, so we can use this im collection classes
  - java.util.Iterator

- Iterator 3 methods ->
    - hasNext()
    - next()
    - remove

## cursor -> retrieve value 1 by 1   
### 3 types - Enumerator, Iterator, ListIterator
- forEach loop internally uss iterable iterator

1. Enumeration 
- jdk 1.0 
- for legacy classes like stack and vector
- cursor used to get elements one by one from collection object
- all legacy classes inherits enumeration and we get object of enumeration from elements();
    ```java
  Enumeration e= v.elements(); 
  while (e.hasMoreElements())  //this function will return boolean
            System.out.println(e.nextElement()); //this will print

    ```
- limitations
    - it is only useful for legacy classes
    - we cannot remove elements
    - only forward movement
  
2. Iterator 
- cursor used to get elements one by one from collection object
- universal cursor( can use for all collection classes)
- use for read and remove also 
- jdk 1.2
- can read, remove
- can't add, replace
- can't backtrack
- functions
    - public boolean hasNext()
    - public Object next()
    - public void remove()
- public Iterable iterator();
- ```java
    Iterator itr=list.iterator();
  ```
  
3. ListIterator
- bi-directional cursor
- jdk 1.2
- works only with list implemented classes
- can read, remove, insert and replace (no indexing basis)
- public ListIterator listIterator()
- It supports all the four CRUD operations(Create, Read, Update, Delete) operations.
- functions
    - public boolean hasNext()
    - public Object next()
    - public int nextIndex()
    - public boolean hasPrevious()
    - public object previous()
    - public int previousIndex()
    - public void remove()
    - the ListIterator does not automatically reset to the beginning after the forward iteration ends.
    - public void add(object ob)  --->collection's fun ---> Adds an element at the current cursor
    - public void set(object ob) ----->listIterator's fun ---> Replaces the last returned element
  
---
Comparison between **`Enumeration`**, **`Iterator`**, and **`ListIterator`** in tabular form:

| **Feature**                | **Enumeration**                          | **Iterator**                          | **ListIterator**                        |
|----------------------------|------------------------------------------|---------------------------------------|-----------------------------------------|
| **Introduced In**           | Java 1.0                                  | Java 1.2                              | Java 1.2                                |
| **Collection Types**        | Legacy collections (`Vector`, `Stack`)   | Modern collections (`ArrayList`, `HashSet`, etc.) | Specific to `List` collections (`ArrayList`, `LinkedList`) |
| **Traversal Direction**     | One-direction (forward only)             | One-direction (forward only)          | Both directions (forward and backward) |
| **Methods**                 | `hasMoreElements()`, `nextElement()`      | `hasNext()`, `next()`, `remove()`     | `hasNext()`, `next()`, `hasPrevious()`, `previous()`, `add()`, `set()`, `remove()` |
| **Modifications Supported** | No (cannot remove or modify elements)    | Yes (can safely remove elements)      | Yes (can remove, add, and set elements) |
| **Use Case**                | Legacy code, `Vector`, `Stack`           | Modern iteration (general purpose)    | Useful for `List` traversal and modification |
| **Common Use**              | Rarely used in modern Java               | Standard for iterating collections    | Used for both forward & backward iteration and modification of `List` |
| **Compatibility**           | Compatible with legacy collections only  | Compatible with all modern collections | Compatible only with `List` collections |

### **Summary**:
- **`Enumeration`** is old and only used for legacy collections like `Vector` and `Stack`.
- **`Iterator`** is the most widely used for general-purpose iteration and safe element removal.
- **`ListIterator`** is used for **List** collections when you need both forward and backward iteration, and also need to modify the list during iteration (add, set, or remove elements).
---

Comparison between **`Enumeration`**, **`Iterator`**, and **`ListIterator`** in tabular form:


| **Feature**                | **Enumeration**                          | **Iterator**                          | **ListIterator**                        |
|----------------------------|------------------------------------------|---------------------------------------|-----------------------------------------|
| **Introduced In**           | Java 1.0                                  | Java 1.2                              | Java 1.2                                |
| **Collection Types**        | Legacy collections (`Vector`, `Stack`)   | Modern collections (`ArrayList`, `HashSet`, etc.) | Specific to `List` collections (`ArrayList`, `LinkedList`) |
| **Traversal Direction**     | One-direction (forward only)             | One-direction (forward only)          | Both directions (forward and backward) |
| **Methods**                 | `hasMoreElements()`, `nextElement()`      | `hasNext()`, `next()`, `remove()`     | `hasNext()`, `next()`, `hasPrevious()`, `previous()`, `add()`, `set()`, `remove()` |
| **Modifications Supported** | No (cannot remove or modify elements)    | Yes (can safely remove elements)      | Yes (can remove, add, and set elements) |
| **Use Case**                | Legacy code, `Vector`, `Stack`           | Modern iteration (general purpose)    | Useful for `List` traversal and modification |
| **Common Use**              | Rarely used in modern Java               | Standard for iterating collections    | Used for both forward & backward iteration and modification of `List` |
| **Compatibility**           | Compatible with legacy collections only  | Compatible with all modern collections | Compatible only with `List` collections |

### **Summary**:
- **`Enumeration`** is old and only used for legacy collections like `Vector` and `Stack`.
- **`Iterator`** is the most widely used for general-purpose iteration and safe element removal.
- **`ListIterator`** is used for **List** collections when you need both forward and backward iteration, and also need to modify the list during iteration (add, set, or remove elements).

---
# List
- interface (java.util)
- jdk 1.2
- index based ds
- homogeneous data
- duplicate vals
- can store n num of null values
- follows insertion order
- does not follow sorting order 
- all are non synchronized

## ArrayList
- initial value-10 if we enter 10, it will create new list of size (initial val *3/2)+1 and add previous and new elements
- when to use
  - it is good for retrieval because it inherits RandomAccess Interface
- when not to use
  - for insertion and deletion ( bcz it iterates from start)

---
## list diff

| Feature                | **ArrayList**                      | **LinkedList**                           | **Vector**                           | **Stack**                                 |
| ---------------------- | ---------------------------------- | ---------------------------------------- | ------------------------------------ | ----------------------------------------- |
| **Data Structure**     | Dynamic array                      | Doubly linked list                       | Synchronized dynamic array           | LIFO (Last In First Out) using Vector     |
| **Ordering**           | Maintains insertion order          | Maintains insertion order                | Maintains insertion order            | Maintains insertion order                 |
| **Random Access**      | Fast (index-based)                 | Slow (needs traversal)                   | Fast (index-based)                   | Fast (index-based)                        |
| **Insertion/Deletion** | Slow (shifting elements required)  | Fast (just update pointers)              | Slow (like ArrayList)                | Fast for push/pop                         |
| **Thread Safety**      | Not thread-safe                    | Not thread-safe                          | **Thread-safe** (synchronized)       | **Thread-safe** (inherits from Vector)    |
| **Performance**        | Better for search operations       | Better for insert/delete at start/middle | Slower due to synchronization        | Slightly slower due to synchronization    |
| **Growth Policy**      | Grows by 50%                       | Grows as needed (via nodes)              | Grows by doubling size               | Grows by doubling (inherited from Vector) |
| **Use Case**           | When frequent access is needed     | When frequent insert/delete is needed    | When thread-safe ArrayList is needed | When LIFO behavior is needed              |
| **Legacy**             | Part of Java Collections Framework | Part of Java Collections Framework       | **Legacy class**, but still used     | **Legacy class**, extends Vector          |

--- 
## list, set,queue diff

| Feature                    | **List**                             | **Set**                                 | **Queue**                                              |
| -------------------------- | ------------------------------------ | --------------------------------------- | ------------------------------------------------------ |
| **Definition**             | Ordered collection of elements       | Unordered collection of unique elements | Collection for processing elements in a specific order |
| **Allows Duplicates**      | ✅ Yes                                | ❌ No                                    | ✅ Depends on implementation                            |
| **Order Maintained**       | ✅ Yes (insertion order)              | ❌ No (except LinkedHashSet)             | ✅ Yes (usually FIFO)                                   |
| **Index-Based Access**     | ✅ Yes (get by index)                 | ❌ No                                    | ❌ No                                                   |
| **Common Implementations** | `ArrayList`, `LinkedList`            | `HashSet`, `LinkedHashSet`, `TreeSet`   | `PriorityQueue`, `LinkedList`, `ArrayDeque`            |
| **Use Case**               | Storing ordered data with duplicates | Ensuring unique items                   | Managing tasks or requests (e.g. job queue)            |
| **Null Elements**          | ✅ Yes (usually allowed)              | ✅ Yes (some implementations disallow)   | ✅ Yes (except some priority queues)                    |

---
## Diff b/w ArrayDeque and PriorityQueue

| Feature                   | **ArrayDeque**                            | **PriorityQueue**                                |
| ------------------------- | ----------------------------------------- | ------------------------------------------------ |
| 📌 **Purpose**            | Double-ended queue (Deque)                | Priority-based queue                             |
| 📥 **Order of Elements**  | Maintains **insertion order**             | Orders based on **priority** (natural or custom) |
| 📦 **Insertion/Removal**  | From both ends: `addFirst()`, `addLast()` | Always removes element with **highest priority** |
| 🔢 **Internal Structure** | **Resizable array**                       | **Binary Heap (Min-Heap)**                       |
| ❌ **Allows `null`?**      | ❌ No                                      | ❌ No                                             |
| ⚙️ **Use Case**           | Stack + Queue, browser history, undo-redo | Task scheduling, job processing                  |
| 🧠 **Custom Sorting?**    | ❌ No built-in sorting                     | ✅ Yes, using `Comparator`                        |
| 🧵 **Thread-safe?**       | ❌ No                                      | ❌ No                                             |
| 📚 **Implements**         | `Deque` interface                         | `Queue` interface                                |
| 📍 **Example Usage**      | `new ArrayDeque<>()`                      | `new PriorityQueue<>()`                          |

---
## TreeSet, HashSet and LinkedHashSet diff

| Feature                | **HashSet**                          | **LinkedHashSet**             | **TreeSet**                             |
| ---------------------- | ------------------------------------ | ----------------------------- | --------------------------------------- |
| 🔢 **Ordering**        | No order (random)                    | Maintains **insertion order** | Sorted order (natural or custom)        |
| ⚙️ **Underlying DS**   | Hash Table                           | Hash Table + Linked List      | Red-Black Tree (Self-balancing BST)     |
| 🚀 **Performance**     | Fastest (O(1) for add/search/delete) | Slightly slower than HashSet  | Slower (O(log n) for add/search/delete) |
| 🧠 **Allows null?**    | ✅ Yes (only one null element)        | ✅ Yes (only one null element) | ❌ No (throws `NullPointerException`)    |
| 📦 **Duplicates?**     | ❌ No                                 | ❌ No                          | ❌ No                                    |
| 📚 **Implements**      | `Set`                                | `Set`                         | `NavigableSet`, `SortedSet`, `Set`      |
| 🔤 **Sorts elements?** | ❌ No                                 | ❌ No                          | ✅ Yes (Natural/Custom via Comparator)   |

---

| Feature                       | **Hashtable**                        | **HashMap**                                      | **LinkedHashMap**                                | **TreeMap**                               |
| ----------------------------- | ------------------------------------ | ------------------------------------------------ | ------------------------------------------------ | ----------------------------------------- |
| **Thread Safety**             | Synchronized (thread-safe)           | Not synchronized (not thread-safe)               | Not synchronized (not thread-safe)               | Not synchronized (not thread-safe)        |
| **Order**                     | No guaranteed order                  | No guaranteed order                              | Maintains insertion order                        | Sorted order (by keys, natural or custom) |
| **Null Keys Allowed**         | No (null keys or values not allowed) | Yes (one null key, multiple null values allowed) | Yes (one null key, multiple null values allowed) | No (null keys not allowed)                |
| **Underlying Data Structure** | Hash table                           | Hash table                                       | Hash table + doubly linked list                  | Red-Black tree (self-balancing BST)       |
| **Performance**               | Slower due to synchronization        | Faster (unsynchronized)                          | Slightly slower than HashMap                     | Slower due to tree operations (O(log n))  |
| **Introduced In**             | Java 1.0                             | Java 1.2                                         | Java 1.4                                         | Java 1.2                                  |
| **Use Case**                  | Legacy thread-safe map               | General-purpose non-thread-safe map              | When insertion order matters                     | When sorted map needed                    |
