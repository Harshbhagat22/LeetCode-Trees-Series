# 🌳 LeetCode Trees Series (Java Solutions)

This repository contains **Java solutions** for tree-based problems from [LeetCode](https://leetcode.com/).
It is designed for **coding interview preparation** and to help developers strengthen their **Tree and Binary Search Tree (BST)** knowledge.

---

## 📌 Topics Covered

* **Binary Tree Basics**

  * Traversals (Preorder, Inorder, Postorder, Level-order)
  * Maximum Depth / Minimum Depth
  * Diameter of Binary Tree
  * Path Sum Problems

* **Binary Search Trees (BST)**

  * Insertion, Deletion, Search
  * Validate BST
  * Lowest Common Ancestor
  * Convert Sorted Array to BST

* **Advanced Tree Problems**

  * Serialize & Deserialize Binary Tree
  * Construct Tree from Traversals
  * Flatten Binary Tree to Linked List
  * Binary Tree Cameras
  * Recover BST

* **Special Trees**

  * N-ary Trees
  * Trie (Prefix Tree)
  * Segment Tree
  * Fenwick Tree (Binary Indexed Tree)

---

## 🛠️ How to Run

1. Clone the repo

   ```bash
   git clone https://github.com/<your-username>/LeetCode_Trees_Series.git
   cd LeetCode_Trees_Series
   ```

2. Compile and run Java files

   ```bash
   javac Solution.java
   java Solution
   ```

3. Each problem is stored in a **separate folder** with the following format:

   ```
   <problem_number>_<problem_name>/
       ├── Solution.java
       ├── README.md  (explanation + approach)
   ```

---

## 📂 Repository Structure

```
LeetCode_Trees_Series/
│
├── Binary_Tree/
│   ├── 0104_Maximum_Depth_of_Binary_Tree/
│   │   ├── Solution.java
│   │   └── README.md
│   ├── 0110_Balanced_Binary_Tree/
│   │   ├── Solution.java
│   │   └── README.md
│   └── ...
│
├── Binary_Search_Tree/
│   ├── 0098_Validate_BST/
│   │   ├── Solution.java
│   │   └── README.md
│   ├── 0700_Search_in_BST/
│   │   ├── Solution.java
│   │   └── README.md
│   └── ...
│
└── Advanced_Trees/
    ├── 0297_Serialize_and_Deserialize_BT/
    │   ├── Solution.java
    │   └── README.md
    └── ...
```

---

## 🧠 Problem Format

Each problem folder contains:

* **README.md**

  * Problem Link
  * Intuition
  * Approach
  * Complexity Analysis (Time & Space)

* **Solution.java**

  ```java
  /**
   * Problem: 104. Maximum Depth of Binary Tree
   * Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
   *
   * Time Complexity: O(n)
   * Space Complexity: O(h) where h is tree height
   */
  class Solution {
      public int maxDepth(TreeNode root) {
          if (root == null) return 0;
          return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
      }
  }
  ```

---

## 🎯 Goals of this Repo

* ✅ Build a **complete set of Java tree solutions** for LeetCode.
* ✅ Provide **clear explanations + clean code**.
* ✅ Cover both **easy, medium, and hard** tree problems.
* ✅ Help students & professionals crack **FAANG / top company interviews**.

---

## 🤝 Contributing

* Fork the repo & add your solution.
* Make sure code is properly formatted and commented.
* Submit a PR 🚀

---

## ⭐ Support

If you find this repository helpful, please **star ⭐ it** and share with friends preparing for DSA in Java!

---

