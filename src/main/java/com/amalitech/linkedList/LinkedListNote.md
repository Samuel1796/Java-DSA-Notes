# Linked List

## Overview

A **Linked List** is a linear data structure where elements are stored in **nodes**, and each node points to the next node in the sequence. Unlike arrays, linked lists do **not store elements in contiguous memory locations**.

---

## Basic Structure of a Node

Each node contains two parts:

* **Data** – the value stored in the node
* **Next** – a reference (pointer) to the next node

```
[data | next]
```

---

## Types of Linked Lists

### 1. Singly Linked List

* Each node points to the next node
* Last node points to `null`

```
A → B → C → null
```

---

### 2. Doubly Linked List

* Each node has two pointers:

    * `prev` → previous node
    * `next` → next node

```
null ← A ⇄ B ⇄ C → null
```

---

### 3. Circular Linked List

* Last node points back to the first node
* Can be singly or doubly linked

```
A → B → C
↑         ↓
└─────────┘
```

---

## Common Operations

### 1. Insertion

* At the beginning
* At the end
* At a specific position

**Time Complexity:** `O(1)` (if position is known)

---

### 2. Deletion

* From the beginning
* From the end
* A specific node

**Time Complexity:** `O(1)` (if node reference is known)

---

### 3. Traversal

* Visit each node starting from the head

**Time Complexity:** `O(n)`

---

### 4. Searching

* Check each node sequentially

**Time Complexity:** `O(n)`

---

## Advantages of Linked Lists

* Dynamic size (can grow or shrink easily)
* Efficient insertions and deletions
* No memory wastage due to resizing

---

## Disadvantages of Linked Lists

* Extra memory required for pointers
* No random access (unlike arrays)
* Slower traversal due to pointer chasing

---

## Comparison: Array vs Linked List

| Feature            | Array                 | Linked List    |
| ------------------ | --------------------- | -------------- |
| Memory             | Contiguous            | Non-contiguous |
| Size               | Fixed / costly resize | Dynamic        |
| Access             | O(1)                  | O(n)           |
| Insertion/Deletion | O(n)                  | O(1)*          |

*When position is known

---

## Applications of Linked Lists

* Implementation of stacks and queues
* Adjacency list in graphs
* Dynamic memory allocation
* Undo/Redo operations
* Music playlist navigation

---

## Summary

Linked Lists are flexible linear data structures that allow efficient insertions and deletions. They trade off fast random access for dynamic memory usage, making them useful in scenarios where frequent updates are required.
