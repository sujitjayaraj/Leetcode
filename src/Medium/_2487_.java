package Medium;

import Common.ListNode;
/**
 * Question 2487
 * <a href="https://leetcode.com/problems/remove-nodes-from-linked-list/">Remove Nodes From a Linked List</a>
 */

public class _2487_ {
    
    /**
     * Removes every node which has a node with a greater value anywhere to the right side of it.
     * 
     * @param head Head {@link ListNode} of the linked list.
     * @return Head {@link ListNode} of the modified linked list.
     */
    public ListNode removeNodes(ListNode head) {
        head = reverseLinkedList(head);
        ListNode curr = head, next = null;
        while (curr.next != null) {
            next = curr.next;
            if (next.val < curr.val)
                curr.next = next.next;
            else
                curr = next;
        }
        head = reverseLinkedList(head);
        return head;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}