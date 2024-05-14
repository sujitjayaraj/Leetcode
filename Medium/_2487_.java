package Medium;

// Remove Nodes From a Linked List
// https://leetcode.com/problems/remove-nodes-from-linked-list/

public class _2487_ {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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