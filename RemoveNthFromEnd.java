//Question 19 named Remove Nth Node From End of List

class RemoveNthFromEnd
{
    static int n_global;
    
    public static ListNode main(ListNode head, int n){
        n_global = n;
        
        head = deleteFromReverse(head);
        return head;
    }
    
    public static ListNode deleteFromReverse(ListNode head){
        ListNode node = null;
        if(head.next != null){
            node = deleteFromReverse(head.next);
        }
        n_global--;
        if(n_global == 0){
            return node;
        }
        
        head.next = node;
        return head;
    }
}