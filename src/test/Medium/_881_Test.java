package test.Medium;

import main.Medium._881_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _881_Test {
    @ParameterizedTest
    @MethodSource("testData")
    void testMethod(int[] people, int limit, int expected) {
        _881_ obj = new _881_();
        int result = obj.numRescueBoats(people, limit);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[] {1, 2}, 3, 1),
            Arguments.of(new int[] {3, 2, 2, 1}, 3, 3),
            Arguments.of(new int[] {3, 5, 3, 4}, 5, 4),
            Arguments.of(new int[] {5, 1, 4, 2}, 6, 2)
        );
    }
}