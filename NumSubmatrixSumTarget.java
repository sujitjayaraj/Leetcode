//Question 1074 Number of Submatrices That Sum to Target

import java.util.Map;
import java.util.HashMap;
public class NumSubmatrixSumTarget
{
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int result = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        for (int col1 = 0; col1 < cols; col1++) {
            for (int col2 = col1; col2 < cols; col2++) {
                Map<Integer, Integer> prefixSumCount = new HashMap<>();
                prefixSumCount.put(0, 1);
                int currentSum = 0;

                for (int row = 0; row < rows; row++) {
                    int sum = matrix[row][col2] - (col1 > 0 ? matrix[row][col1 - 1] : 0);
                    currentSum += sum;
                    result += prefixSumCount.getOrDefault(currentSum - target, 0);
                    prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
                }
            }
        }

        return result;
    }
}
