//Question 2133 named Check if Every Row and Column Contains All Numbers

class CheckValidMatrix
{
    public static boolean main(int[][] matrix){
        int[] arr1, arr2;
        for(int i=0; i<matrix.length; i++){
            arr1 = new int[matrix.length];
            arr2 = new int[matrix.length];
            for(int j=0; j<matrix.length; j++){
                arr1[matrix[i][j]-1]++;
                arr2[matrix[j][i]-1]++;
                if(arr1[matrix[i][j]-1] > 1 || arr2[matrix[j][i]-1] > 1){
                    return false;
                }
            }
        }
        return true;
    }
}