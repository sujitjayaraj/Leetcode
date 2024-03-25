//Question 143 named Reorder List

class ReorderList
{
    public void reorderList(ListNode head) {
        ListNode p1 = head, p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;
        }
        ListNode p3 = p1;
        p1 = null;
        p2 = null;
        while (p3 != null) {
            p2 = p3.next;
            p3.next = p1;
            p1 = p3;
            p3 = p2;
        }
        ListNode head2 = p1;
        p1 = head;
        p2 = head;
        p3 = head2;
        while (p1 != null && head2 != null) {
            p2 = p2.next;
            p1.next = p3;
            p1 = p2;
            p3 = p3.next;
            head2.next = p2;
            head2 = p3;
        }
    }
}