package test.Easy;

import main.Easy._506_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _506_Test {
    @ParameterizedTest
    @MethodSource("inputData")
    public void testMethod(int[] input, String[] expected) {
        _506_ test = new _506_();
        String[] result = test.findRelativeRanks(input);
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> inputData(){
        return Stream.of(
            Arguments.of(new int[]{5, 4, 3, 2, 1}, new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}),
            Arguments.of(new int[]{10, 3, 8, 9, 4}, new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"})
        );
    }
}