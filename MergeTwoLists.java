//Question 21 named Merge Two Sorted Lists

class MergeTwoLists
{
    private class ListNode
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode main(ListNode list1, ListNode list2){
        if(list1 == null) { return list2; }
        else if(list2 == null) { return list1; }
        
        ListNode ptr1 = list1, ptr2 = list2, result = null, ptr3 = result;
        
        if(ptr1.val >= ptr2.val){
            result = ptr2;
            ptr2 = ptr2.next;
        }
        else{
            result = ptr1;
            ptr1 = ptr1.next;
        }
        ptr3 = result;
        
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val >= ptr2.val){
                ptr3.next = ptr2;
                ptr3 = ptr2;
                ptr2 = ptr2.next;
            }
            else{
                ptr3.next = ptr1;
                ptr3 = ptr1;
                ptr1 = ptr1.next;
            }
        }
        
        if(ptr1 != null){
            ptr3.next = ptr1;
        }
        else{
            ptr3.next = ptr2;
        }
        
        return result;
    }
}