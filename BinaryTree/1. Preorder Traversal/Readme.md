

# Intuition

Preorder traversal means visiting the root first, then the left subtree, and finally the right subtree.
The first thought is: whenever we encounter a node, we should immediately add it to our result list before exploring its children.

# Approach

We use a simple recursive function to perform preorder traversal:

1. If the current node is `null`, return (base case).
2. Add the value of the current node to the result list.
3. Recursively call the function on the left child.
4. Recursively call the function on the right child.

This naturally follows the **Root → Left → Right** order required for preorder traversal.

# Complexity

* **Time complexity:**
  Each node is visited exactly once → **O(n)**, where `n` is the number of nodes in the tree.

* **Space complexity:**

  * The result list requires **O(n)**.
  * The recursion stack in the worst case (skewed tree) can also take **O(n)**, while in a balanced tree it is **O(log n)**.
    So overall → **O(n)** in the worst case.

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    public static void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);            // Visit root
        preorder(root.left, list);     // Traverse left
        preorder(root.right, list);    // Traverse right
    }
}
```

---
