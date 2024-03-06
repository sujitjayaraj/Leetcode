//Question 141 named Linked List Cycle

import java.util.HashSet;

class LinkedListCycle
{
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<ListNode>();
        
        while(head != null)
        {
            if(visited.contains(head)){
                return true;
            }
            
            visited.add(head);
            head = head.next;
        }
        
        return false;
    }
}