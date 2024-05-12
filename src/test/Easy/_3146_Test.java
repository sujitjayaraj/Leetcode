package main.Easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3146_Test {
    @ParameterizedTest
    @CsvSource({
        "abc, bac, 2",
        "abcde, edbac, 12"
    })
    void testMethod(String s, String t, int expected){
        _3146_ obj = new _3146_();
        int result = obj.findPermutationDifference(s, t);
        assertEquals(expected, result);
    }
}