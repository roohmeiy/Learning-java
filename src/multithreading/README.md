##  What is the `main` thread?

* It's the **initial thread** of execution.
* It is automatically created by the JVM.
* It starts executing your program from the `main(String[] args)` method.
---

## ✅ **What `start()` does:**

* It **creates a new thread of execution** (a separate call stack).
* It **calls the `run()` method** of the thread **on that new thread**, not on the main thread.
* It lets **multiple threads run in parallel** (if the system supports it).

### What Happens Internally:
* `start()` is a native method implemented in JVM.  It registers the thread with the OS, sets up the call stack, and executes run() on a new thread.
---

### If we call run() rather than start()
* Then it just calls the method like a normal function — runs on the current thread, no new thread is created.

* You can overload the run() method in Java — but only the version with no arguments will be called when a thread is started using start().
  - When you call start(), the JVM only looks for run() with no arguments.
  - Any overloaded run(...) methods must be called manually, like a normal method.

- We can not invoke same thread 2 time by calling start fun(), it will give runtime error

---

##  Daemon thread
- Background Execution: Daemon threads are low-priority threads that run in the background.
- JVM Dependency: The JVM doesn't wait for daemon threads to complete before exiting.
- Automatic Termination: When all non-daemon (user) threads finish, all daemon threads are terminated automatically by the JVM.
---
## methods

- isInterrupted() -> Checks if a thread has been interrupted. Returns true if the thread was interrupted, false otherwise.
- interrupt() -> Interrupts a thread by setting an interrupted flag. Doesn't forcefully stop the thread but signals it to stop.
- sleep(long millis) throws InterruptedException
- yield() -> Hints to the scheduler that the current thread can pause to allow other threads to execute. The scheduler may ignore this hint.
- join() -> Purpose: Makes the calling thread wait until the specified thread finishes execution.

---

## Executors in Java

Executors are part of Java's concurrency framework (java.util.concurrent) that provide a higher-level replacement for working directly with threads. They simplify thread management and provide efficient thread pooling mechanisms.