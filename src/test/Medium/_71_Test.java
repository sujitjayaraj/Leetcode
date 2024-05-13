package test.Medium;

import main.Medium._71_;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _71_Test {
    @ParameterizedTest
    @MethodSource("testInput")
    public void testMethod(String path, String expectedResult) {
        _71_ obj = new _71_();
        String result = obj.simplifyPath(path);
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> testInput() {
        return Stream.of(
            Arguments.of("/home/", "/home"),
            Arguments.of("/../", "/"),
            Arguments.of("/home//foo/", "/home/foo"),
            Arguments.of("/a/./b/../../c/", "/c"),
            Arguments.of("/.../a/../b/c/../d/./", "/.../b/d")
        );
    }
}
