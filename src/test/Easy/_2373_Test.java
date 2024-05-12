package test.Easy;

import main.Easy._2373_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2373_Test {
    @ParameterizedTest
    @MethodSource("provideList")
    void testMethod(int[][] grid, int[][] expected){
        _2373_ obj = new _2373_();
        int[][] result = obj.largestLocal(grid);
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> provideList() {
        return Stream.of(
                Arguments.of(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}}, new int[][]{{9,9},{8,6}}),
                Arguments.of(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}}, new int[][]{{2,2,2},{2,2,2},{2,2,2}})
        );
    }
}
