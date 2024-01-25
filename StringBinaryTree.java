//Question 606 named Construct String from Binary Tree

public class StringBinaryTree
{
    static StringBuilder str;
    public String tree2str(TreeNode root) {
        str = new StringBuilder();
        recursiveTree(root);

        return str.toString();
    }

    private void recursiveTree(TreeNode root){
        if(root == null){
            return;
        }
        
        str.append(root.val);
        if(root.left == null && root.right == null){
            return;
        }
        
        str.append("(");
        recursiveTree(root.left);
        str.append(")");

        if(root.right != null){
            str.append("(");
            recursiveTree(root.right);
            str.append(")");
        }

        return;
    }
}
