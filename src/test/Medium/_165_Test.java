package test.Medium;

import main.Medium._165_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _165_Test {
    @ParameterizedTest
    @CsvSource({
        "1.2, 1.10, -1",
        "1.01, 1.001, 0",
        "1.0, 1.0.0.0, 0",
    })
    void testMethod(String version1, String version2, int expected) {
        _165_ obj = new _165_();
        int result = obj.compareVersion(version1, version2);
        assertEquals(expected, result);
    }
}
