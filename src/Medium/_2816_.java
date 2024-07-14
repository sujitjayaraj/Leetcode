package Medium;

import Common.ListNode;

/**
 * Question 2816
 * <a href="https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/">Double a Number Represented as a Linked List</a>
 */

public class _2816_ {
    
    /**
     * Modifies the linked list by doubling the non-negative integer
     * represented by this linked list.
     * 
     * @param head Head {@link ListNode} of the linked list.
     * @return Head {@link ListNode} of the modified linked list.
     */
    public ListNode doubleIt(ListNode head) {
        ListNode left, curr = head;
        int res = 0;
        res = curr.val * 2;
        curr.val = res % 10;
        if (res >= 10) {
            left = new ListNode(1, curr);
            head = left;
        }
        left = curr;
        curr = curr.next;
        while (curr != null) {
            res = curr.val * 2;
            curr.val = res % 10;
            if (res >= 10)
                left.val++;

            left = curr;
            curr = curr.next;
        }
        return head;
    }
}