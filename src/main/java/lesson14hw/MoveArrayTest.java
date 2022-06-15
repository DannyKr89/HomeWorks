package lesson14hw;

import lesson3hw.HomeWork3;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MoveArrayTest {
    @DisplayName("Проверка сдвига вперед")
    @Test
    public void testMoveArrayOne() {
        Assertions.assertArrayEquals(new int[]{3, 1, 2}, HomeWork3.moveArray(new int[]{1, 2, 3}, 1));
    }

    @DisplayName("Проверка сдвига назад")
    @Test
    public void testMoveArrayTwo() {
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, HomeWork3.moveArray(new int[]{1, 2, 3, 4, 5, 6, 7}, -2));
    }

    @Test
    @DisplayName("Проверка на неправельный сдвиг")
    public void testMoveArrayWrong() {
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, HomeWork3.moveArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 0));
    }

    @DisplayName("Параметризованный тест на сдвиг массива вперед и назад")
    @ParameterizedTest
    @MethodSource("tests")
    void moveTest(int[] exp, int[] arr, int n) {
        Assertions.assertArrayEquals(exp, HomeWork3.moveArray(arr, n));
    }

    static Stream<Arguments> tests() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 3, 1}, new int[]{1, 2, 3}, 2),
                Arguments.arguments(new int[]{2, 3, 1}, new int[]{1, 2, 3}, -1)
        );
    }
}
