package test.Medium;

import main.Medium._3075_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3075_Test {
    @ParameterizedTest
    @MethodSource("testInputs")
    void testMethod(int[] happiness, int k, long expected) {
        _3075_ obj = new _3075_();
        long result = obj.maximumHappinessSum(happiness, k);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testInputs(){
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3}, 2, 4),
            Arguments.of(new int[]{1, 1, 1, 1}, 2, 1),
            Arguments.of(new int[]{2, 3, 4, 5}, 1, 5)
        );
    }
}