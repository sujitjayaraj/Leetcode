//Question 1457 named Pseudo-Palindromic Paths in a Binary Tree

class PseudoPalindromicPaths
{
    public int pseudoPalindromicPaths(TreeNode root){
        int result = recursivePath(root, new int[10]);
        return result;
    }
    
    private int recursivePath(TreeNode root, int[] digits){
        digits[root.val]++;
        
        if(root.left == null && root.right == null){
            int oddCount = 0;
            for(int i: digits){
                oddCount += i & 1;
            }
            digits[root.val]--;
            if(oddCount <= 1){
                return 1;
            }

            return 0;
        }

        int sum1 = 0, sum2 = 0;
        
        if(root.left != null){
            sum1 = recursivePath(root.left, digits);
        }
        if(root.right != null){
            sum2 = recursivePath(root.right, digits);
        }

        digits[root.val]--;

        return sum1 + sum2;
    }
}