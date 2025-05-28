##  What is the `main` thread?

* It's the **initial thread** of execution.
* It is automatically created by the JVM.
* It starts executing your program from the `main(String[] args)` method.
---

## ✅ **What `start()` does:**

* It **creates a new thread of execution** (a separate call stack).
* It **calls the `run()` method** of the thread **on that new thread**, not on the main thread.
* It lets **multiple threads run in parallel** (if the system supports it).

---