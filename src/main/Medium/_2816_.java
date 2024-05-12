package main.Medium;

// Double a Number Represented as a Linked List
// https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/

public class _2816_ {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
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
