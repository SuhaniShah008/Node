# Binary Search Tree (Java)

This project implements a **Binary Search Tree (BST)** in Java, including node insertion, deletion, and traversal methods.  
It also includes a demo program (`Main.java`) that builds a simple BST and prints all three traversal orders.

---

## Project Files

### **Main.java**
Contains the program entry point.

- Creates a `SearchTree`
- Inserts sample values (`1`, `3`)
- Prints:
  - Preorder traversal
  - Postorder traversal
  - Inorder traversal

---

### **Node.java**
Represents a single node in the binary search tree.

A `Node` contains:

- An integer value (`input`)
- References to `left` and `right` child nodes
- `.toString()` for clean printing
- `.compareTo()` for comparing two nodes
- `.equals()` for value-based equality

---

### **SearchTree.java**
Implements the Binary Search Tree structure.

#### Core Features:
- **Insertion**
  - Places new values in the proper sorted position
- **Deletion**
  - Handles deleting nodes with:
    - No children  
    - One child  
    - Two children (using inorder successor)
- **Traversal Methods**
  - `inorder()` → Left, Root, Right  
  - `callPreorder()` → Root, Left, Right  
  - `callPostorder()` → Left, Right, Root  
- **minimumVal()**
  - Finds the smallest value in a subtree (used for node deletion)
