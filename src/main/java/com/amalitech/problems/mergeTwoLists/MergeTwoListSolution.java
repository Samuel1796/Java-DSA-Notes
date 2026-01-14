package com.amalitech.problems.mergeTwoLists;

public class MergeTwoListSolution {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println(mergedList.toString());

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode initializer = new ListNode(-1);
        ListNode current = initializer;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return initializer.next;
    }
}
/**
 * Since the lists are already sorted, we can use a two-pointer technique to efficiently merge them.
 * Algorithm:
 * Compares first item of each list
 * Appends smaller item to new list
 * Moves pointer of list from which item was taken
 * Repeats until one list is exhausted
 * Appends remaining items of non-exhausted list to new list
 * Returns new merged list
 */
