//Question 23 named Merge k Sorted Lists

import java.util.Comparator;
import java.util.PriorityQueue;

class MergeKLists
{    
    public static ListNode main(ListNode[] lists){
        if(lists.length == 0){
            return null;
        }
        
        PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(Comparator.comparingInt(x -> x.val));
        ListNode temp;
        for(int i=0; i<lists.length; i++){
            temp = lists[i];
            while(temp != null){
                p.add(temp);
                temp = temp.next;
            }
        }
        
        ListNode result = p.poll();
        temp = result;
        while(p.size() > 0){
            temp.next = p.poll();
            temp = temp.next;
        }
        if(temp != null){
            temp.next = null;
        }
        
        return result;
    }
}