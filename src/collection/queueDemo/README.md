## Method	Description
add(E e)	Inserts the element, throws exception if it fails
offer(E e)	Inserts the element, returns false if it fails
remove()	Retrieves and removes head, throws exception if empty
poll()	Retrieves and removes head, returns null if empty
element()	Retrieves head without removing, exception if empty
peek()	Retrieves head without removing, null if empty

## PriorityBlockingQueue
- PriorityBlockingQueue is one alternative implementation if thread-safe implementation is needed. PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations. It is unbounded, adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. Let’s see how to create a queue object using this class.

## Deque
addFirst(e)	Adds to front
addLast(e)	Adds to rear
removeFirst()	Removes from front
removeLast()	Removes from rear
peekFirst()	Retrieves front element
peekLast()	Retrieves rear element

## ArrayDeque
- Type: Class that implements Deque 
- Backed by: Resizable array, more efficient than LinkedList
- Faster: For stack/queue operations (no capacity restrictions)
- Not thread-safe

| Feature             | Deque (Interface)          | ArrayDeque (Class)        |
| ------------------- | -------------------------- | ------------------------- |
| Type                | Interface                  | Concrete class            |
| Package             | `java.util`                | `java.util`               |
| Can be instantiated | ❌ No                       | ✅ Yes                     |
| Implements Deque    | —                          | ✅ Yes                     |
| Null elements       | Allowed (depends on impl.) | ❌ Not allowed             |
| Backed by           | Depends on impl.           | Array                     |
| Performance         | Depends                    | Very fast for stack/queue |
| Thread-safe         | ❌ No                       | ❌ No                      |
