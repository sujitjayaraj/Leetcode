//Question 1669 named Merge In Between Linked List

class MergeInBetween
{
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p1 = list1, p2 = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        for (int i = 0; i <= b; i++) {
            if (i == a - 1) {
                ListNode temp = p1.next;
                p1.next = p2;
                p1 = temp;
                i++;
            }
            p1 = p1.next;
        }
        list2.next = p1;
        return list1;
    }
}