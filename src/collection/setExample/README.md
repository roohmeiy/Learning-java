

In Java's **HashMap**, the underlying data structure for storing key-value pairs is primarily **an array of buckets**. Each bucket can contain multiple entries in case of hash collisions.

- **Before Java 8**: HashMap used a **LinkedList** in each bucket to store entries when multiple keys hashed to the same index. This meant that lookup time could degrade to **O(n)** in the worst case.

- **Since Java 8**: When the number of entries in a single bucket exceeds a certain threshold (`TREEIFY_THRESHOLD`), **HashMap automatically converts the linked list into a Binary Search Tree (BST, specifically a Red-Black Tree)**. This improves worst-case lookup time to **O(log n)**.

### Summary:
✅ **Default:** Array of buckets  
✅ **Collision Handling:**
- Few elements → **Linked List** (O(n) lookup)
- Many elements → **Red-Black Tree (BST)** (O(log n) lookup)

Would you like an example to see how it works internally? 😊
