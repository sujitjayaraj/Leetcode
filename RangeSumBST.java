//Question 938 named Range Sum of BST

class RangeSumBST
{
    public static int main(TreeNode root, int low, int high){
        int sum = recursiveRangeSum(root, low, high);
        return sum;
    }
    
    private static int recursiveRangeSum(TreeNode root, int low, int high){
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.val < low){
            sum += recursiveRangeSum(root.right, low, high);
        }
        else if(root.val > high){
            sum += recursiveRangeSum(root.left, low, high);
        }
        else if(root.val == low){
            sum = root.val;
            sum += recursiveRangeSum(root.right, low, high);
        }
        else if(root.val == high){
            sum = root.val;
            sum += recursiveRangeSum(root.left, low, high);
        }
        else{
            sum = root.val;
            sum += recursiveRangeSum(root.left, low, high);
            sum += recursiveRangeSum(root.right, low, high);
        }
        
        return sum;
    }
}