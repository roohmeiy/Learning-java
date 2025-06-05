## 1️⃣ **Comparable**

* It’s an **interface** used to define the **natural ordering** of objects.
* A class implements `Comparable` to specify **how its objects should be compared**.
* Has one method: `compareTo()`.
* Used when you want your class objects to be sorted by default (e.g., in `Collections.sort()`).

## 2️⃣ **Comparator**

* It’s an **interface** used to define **custom ordering** for objects.
* You create separate `Comparator` classes or use lambdas to define different ways to sort objects.
* Has one method: `compare()`.
* Useful if you want multiple ways to sort objects without changing the class.

