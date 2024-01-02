//Question 2 named Add Two Numbers

class AddTwoNumbers{
    public static ListNode main(int[] arr1, int[] arr2){
        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);
        ListNode result = addTwoNumbers(list1, list2);
        return result;
    }
    
    static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int sum = 0;
        ListNode ptr1 = l1, ptr2 = l2, result = null, ptr3 = null;
        while(ptr1 != null || ptr2 != null){
            if(ptr1 != null){
                sum += ptr1.val;
                ptr1 = ptr1.next;
            }
            if(ptr2 != null){
                sum += ptr2.val;
                ptr2 = ptr2.next;
            }
            if(result == null){
                result = new ListNode(sum%10);
                ptr3 = result;
            }
            else{
                ptr3.next = new ListNode(sum%10);
                ptr3 = ptr3.next;
            }
            sum /= 10;
        }
        while(sum != 0){
            ptr3.next = new ListNode(sum%10);
            ptr3 = ptr3.next;
            sum /= 10;
        }
        return result;
    }
    
    static ListNode createList(int[] arr){
        ListNode result = null, ptr = null;
        for(int i: arr){
            if(result == null){
                result = new ListNode(i);
                ptr = result;
            }
            else{
                ptr.next = new ListNode(i);
                ptr = ptr.next;
            }
        }
        return result;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
}