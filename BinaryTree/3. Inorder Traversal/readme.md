# Intuition

Inorder traversal means visiting nodes in the order:
**Left Subtree → Root → Right Subtree**.
This pattern is especially useful in Binary Search Trees (BSTs) because it produces the nodes in sorted order. Since each subtree follows the same traversal rule, recursion is a natural way to solve the problem.

---

# Approach

1. Create an empty list to store the traversal result.
2. Define a recursive helper function:

   * If the node is `null`, return.
   * Recursively traverse the **left subtree**.
   * Add the current node’s value to the result list.
   * Recursively traverse the **right subtree**.
3. Call the helper function with the root node.
4. Return the result list.

---

# Complexity

* **Time complexity:** `O(n)`
  Every node is visited exactly once, where *n* is the total number of nodes.

* **Space complexity:**

  * The recursion stack depends on the height of the tree.
  * Worst case (skewed tree): `O(n)`
  * Best case (balanced tree): `O(log n)`
  * The output list requires `O(n)`.
  * Overall → **O(n)**

---

# Code

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);   // Traverse left subtree
        list.add(root.val);         // Visit root
        inorder(root.right, list);  // Traverse right subtree
    }
}
```

