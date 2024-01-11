//Question 1026 named Maximum Difference Between Node and Ancestor

class MaxAncestorDifference
{
    private static int maxDiff;
    public static int main(TreeNode root){
        if(root.left != null){
            maxDiff = (int)Math.abs(root.val-root.left.val);
        }
        else if(root.right != null){
            maxDiff = (int)Math.abs(root.val-root.right.val);
        }
        recursiveMinMax(root);
        return maxDiff;
    }
    
    private static int[] recursiveMinMax(TreeNode root){
        if(root == null){
            return null;
        }
        int[] left = recursiveMinMax(root.left);
        int[] right = recursiveMinMax(root.right);
        
        if(left == null && right == null){
            return new int[]{root.val, root.val};
        }
        int result[] = new int[2];
        if(left != null && right != null){
            result[0] = Math.min(left[0], right[0]);
            result[1] = Math.max(left[1], right[1]);
        }
        else if(left == null){
            result = right;
        }
        else if(right == null){
            result = left;
        }
        
        result[0] = Math.min(root.val, result[0]);
        result[1] = Math.max(root.val, result[1]);
        
        int tempDiff = (int)Math.max(Math.abs(root.val-result[0]), Math.abs(root.val-result[1]));
        
        maxDiff = Math.max(tempDiff, maxDiff);
        return result;
    }
}
