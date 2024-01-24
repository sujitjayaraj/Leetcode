//Question 24 named Swap Nodes in Pairs

class SwapPairs
{
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp1 = head;
        ListNode temp2 = temp1.next;
        temp1.next = temp2.next;
        temp2.next = temp1;
        head = temp2;
        
        while(temp1.next != null){
            temp2 = temp1.next;

            if(temp2.next == null){
                break;
            }

            temp1.next = temp2.next;
            temp1 = temp2.next;
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp1 = temp1.next;
        }

        return head;
    }
}