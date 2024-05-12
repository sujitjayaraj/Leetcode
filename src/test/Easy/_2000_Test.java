package test.Easy;

import main.Easy._2000_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2000_Test {
    @ParameterizedTest
    @CsvSource({
            "abcdefd, d, dcbaefd",
            "xyxzxe, z, zxyxxe",
            "abcd, z, abcd"
    })
    void testMethod(String word, char ch, String expected){
        _2000_ obj = new _2000_();
        String result = obj.reversePrefix(word, ch);
        assertEquals(expected, result);
    }
}
