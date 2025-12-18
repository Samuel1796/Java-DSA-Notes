# Linked List Application Question (With Solution)

---

## Question Title

**Remove Duplicates from a Sorted Linked List**

---

## Problem Statement

You are given the head of a **sorted singly linked list**.

Your task is to **remove all duplicate elements** from the linked list such that each element appears **only once**.

The linked list must remain **sorted**, and the operation must be performed **in-place** (no extra data structures like arrays or hash sets).

---

## Input

* Head of a sorted singly linked list

## Output

* Head of the modified linked list with duplicates removed

---

## Example

**Input Linked List:**

```
1 → 1 → 2 → 3 → 3 → 4 → null
```

**Output Linked List:**

```
1 → 2 → 3 → 4 → null
```

---

## Constraints

* The linked list contains at least one node
* Node values are integers
* The list is already sorted in non-decreasing order

---

## Key Observation

Because the linked list is **sorted**, any duplicate values will appear **next to each other**.

This allows us to remove duplicates by:

* Comparing each node with its next node
* Skipping the next node if both values are equal

---

## Algorithm

1. Start from the head of the linked list
2. While the current node and the next node exist:

    * If `current.data == current.next.data`

        * Skip the next node
    * Otherwise, move to the next node
3. Continue until the end of the list

---

## Java Implementation

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
```

---

## Dry Run

```
Current List: 1 → 1 → 2 → 3 → 3 → 4

Compare 1 and 1 → duplicate → remove one 1
Compare 1 and 2 → move forward
Compare 2 and 3 → move forward
Compare 3 and 3 → duplicate → remove one 3
Compare 3 and 4 → move forward

Final List: 1 → 2 → 3 → 4
```

---

## Time and Space Complexity

| Metric           | Value |
| ---------------- | ----- |
| Time Complexity  | O(n)  |
| Space Complexity | O(1)  |

---

## Why This Is a Good Application Question

* Tests understanding of **linked list traversal**
* Uses **pointer manipulation**
* Avoids extra memory usage
* Commonly asked in **interviews and exams**

---

## Summary

This problem demonstrates how sorted properties of a linked list can be leveraged to solve problems efficiently using simple pointer adjustments without extra space.
