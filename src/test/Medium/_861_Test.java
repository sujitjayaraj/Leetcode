package test.Medium;

import main.Medium._861_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _861_Test {
    @ParameterizedTest
    @MethodSource("testInput")
    public void testMethod(int[][] grid, int expectedResult) {
        _861_ obj = new _861_();
        int result = obj.matrixScore(grid);
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
            Arguments.of(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}, 39),
            Arguments.of(new int[][]{{0}}, 1)
        );
    }
}