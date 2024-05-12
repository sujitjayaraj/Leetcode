package test.Easy;

import main.Easy._2441_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2441_Test {
    @ParameterizedTest
    @MethodSource("provideArray")
    void testMethod(int[] nums, int expected){
        _2441_ obj = new _2441_();
        int result = obj.findMaxK(nums);
        assertEquals(expected, result);
    }

    static Stream<Arguments> provideArray() {
        return Stream.of(
            Arguments.of(new int[]{-1, 2, -3, 3}, 3),
            Arguments.of(new int[]{-1,10,6,7,-7,1}, 7),
            Arguments.of(new int[]{-10,8,6,7,-2,-3}, -1)
        );
    }
}
