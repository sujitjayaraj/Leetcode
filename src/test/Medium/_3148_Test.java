package test.Medium;

// Maximum Difference Score in a Grid
// https://leetcode.com/problems/maximum-difference-score-in-a-grid/

import main.Medium._3148_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3148_Test {
    @ParameterizedTest
    @MethodSource("provideList")
    void testMethod(int[][] grid, int expected){
        _3148_ obj = new _3148_();
        List<List<Integer>> gridList = new ArrayList<>();
        for (int[] row : grid) {
            ArrayList<Integer> rowList = new ArrayList<>();
            for (int cell : row) {
                rowList.add(cell);
            }
            gridList.add(rowList);
        }
        int result = obj.maxScoreSize(gridList);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> provideList() {
        return Stream.of(
                Arguments.of(new int[][]{{9,5,7,3},{8,9,6,1},{6,7,14,3},{2,5,3,1}}, 9),
                Arguments.of(new int[][]{{4,3,2},{3,2,1}}, -1)
        );
    }
}
