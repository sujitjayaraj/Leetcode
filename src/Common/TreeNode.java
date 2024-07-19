package Common;

/**
 * Represents a node in a binary tree.
 */
public class TreeNode {
    /**
     * Value of the node.
     */
    public int val;
    
    /**
     * Reference to the left child node of the node.
     */
    public TreeNode left; 
    
    /**
     * Reference to the right child node of the node. 
     */
    public TreeNode right;
    
    /**
     * Initializes an empty node.
     */
    public TreeNode() {}
    
    /**
     * Initializes a node with the given value.
     * 
     * @param val Value of the node.
     */
    public TreeNode(int val) { 
        this.val = val; 
    }
    
    /**
     * Initializes a node with the given value and references to the right and left children nodes.
     * 
     * @param val Value of the node.
     * @param left Reference to the left child node.
     * @param right Reference to the right child node.
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }