# Intuition

In **postorder traversal**, nodes are visited in the order:
**Left Subtree → Right Subtree → Root**.
This is naturally suited for recursion because each subtree can be traversed in the same way as the entire tree.

---

# Approach

1. Create a list to store the traversal result.
2. Use a recursive helper method:

   * If the current node is `null`, return.
   * Recursively call the helper on the **left child**.
   * Recursively call the helper on the **right child**.
   * Add the current node’s value to the list.
3. Return the list after traversal is complete.

---

# Complexity

* **Time complexity:** `O(n)`
  Each node is visited exactly once.

* **Space complexity:**

  * Recursion depth depends on the tree’s height.
  * Worst case (skewed tree): `O(n)`
  * Best case (balanced tree): `O(log n)`
  * The result list requires `O(n)` space.
  * Overall: `O(n)`

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    public static void postorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorder(root.left, list);   // Traverse left subtree
        postorder(root.right, list);  // Traverse right subtree
        list.add(root.val);           // Visit root
    }
}
```

Do you want me to also add the **iterative stack-based version** so your notes cover both?

