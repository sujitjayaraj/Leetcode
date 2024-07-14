package Common;

/**
 * Represents a node in a linked list.
 */

public class ListNode
{
    /**
     * value of the node
     */
    public int val;
    
    /**
     * Reference to the next node in a linked list
     */
    public ListNode next;
    
    /**
     * Initializes an empty node
     */
    public ListNode() {}
    
    /**
     * Initializes a node with the given value
     * 
     * @param val value of the node
     */
    public ListNode(int val) {
        this.val = val;
    }
    
    /**
     * Initializes a node with the given value and reference to the next node
     * 
     * @param val value of the node
     * @param next Reference to the next node
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}