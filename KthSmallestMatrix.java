//Question 378 named Kth Smallest Element in a Sorted Matrix

class KthSmallestMatrix
{
    public static int main(int[][] matrix, int k){
        int[] pos = new int[matrix.length];
        int result = 0;
        for(int i=1; i<=k; i++){
            int temp = 0;
            while(pos[temp] >= matrix.length){
                temp++;
            }
            for(int j=0; j<matrix.length; j++){
                if(pos[j] >= matrix.length){
                    continue;
                }
                else if(matrix[j][pos[j]] < matrix[temp][pos[temp]]){
                    temp = j;
                }
            }
            result = matrix[temp][pos[temp]];
            pos[temp]++;
        }
        return result;
    }
}