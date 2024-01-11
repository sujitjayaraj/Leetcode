//Question 872 named Leaf-Similar Trees

import java.util.ArrayList;

class LeafSimilar
{
    public static boolean main(TreeNode root1, TreeNode root2){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(100);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(100);
        recursiveLeafSimilar(root1, arr1);
        recursiveLeafSimilar(root2, arr2);
        arr1.trimToSize();
        arr2.trimToSize();
        return arr1.equals(arr2);
    }
    
    private static void recursiveLeafSimilar(TreeNode root, ArrayList<Integer> arr){
        if(root.left == null && root.right == null){
            arr.add(root.val);
            return;
        }
        if(root.left != null){
            recursiveLeafSimilar(root.left, arr);
        }
        if(root.right != null){
            recursiveLeafSimilar(root.right, arr);
        }
        return;
    }
}