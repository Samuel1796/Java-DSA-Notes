# Implementation of Linked List Types

This document shows **simple, clear implementations** of the major types of linked lists using **Java-style pseudocode** (easy to convert to real Java).

---

## 1️⃣ Singly Linked List

### Node Definition

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

### Singly Linked List Implementation

```java
class SinglyLinkedList {
    Node head;

    // Insert at beginning
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Display list
    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
```

---

## 2️⃣ Doubly Linked List

### Node Definition

```java
class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

---

### Doubly Linked List Implementation

```java
class DoublyLinkedList {
    DNode head;

    // Insert at beginning
    void insertAtHead(int data) {
        DNode newNode = new DNode(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Insert at end
    void insertAtTail(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // Display forward
    void displayForward() {
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
```

---

## 3️⃣ Circular Singly Linked List

### Node Definition

```java
class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

### Circular Linked List Implementation

```java
class CircularLinkedList {
    CNode head;

    // Insert at end
    void insert(int data) {
        CNode newNode = new CNode(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        CNode curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }

    // Display list
    void display() {
        if (head == null) return;

        CNode curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("(back to head)");
    }
}
```

---

## 🔁 Summary Table

| Linked List Type | Pointers per Node  | Special Feature          |
| ---------------- | ------------------ | ------------------------ |
| Singly           | 1 (`next`)         | Simple, memory efficient |
| Doubly           | 2 (`prev`, `next`) | Bidirectional traversal  |
| Circular         | 1 or 2             | No `null` end node       |

---

## 🏁 Final Notes

* Singly Linked Lists are best for **simple insert/delete operations**
* Doubly Linked Lists allow **easy backward traversal**
* Circular Linked Lists are useful in **round-robin scheduling** and **queues**

These implementations are **interview-safe**, **easy to remember**, and **production adaptable**.
