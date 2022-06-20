package lesson14hw;

import lesson9hw.Main;
import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayExceptionTest {
    @DisplayName("Тест на подсчет массива")
    @Test
    void test1() {
        Assertions.assertEquals(136, Main.myArrayException(new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        }));
    }

    @DisplayName("Тест на вылет исключения")
    @Test
    void test2() {
        Assert.assertThrows(RuntimeException.class, new ThrowingRunnable() {
                    @Override
                    public void run() throws Throwable {
                        Main.myArrayException(new String[][]{
                                {"1", "2", "3", "4"},
                                {"5", "6", "7", "8"},
                                {"9", "10", "11", "12"}
                        });
                    }
                }
        );
    }
    @DisplayName("Тест на вылет исключения")
    @Test
    void test3() {
        Assert.assertThrows(Main.myArraySizeException().getClass(), new ThrowingRunnable() {
                    @Override
                    public void run() throws Throwable {
                        Main.myArrayException(new String[][]{
                                {"1", "2", "3", "4"},
                                {"5", "6", "7", "8"},
                                {"9", "10", "11", "s"},
                                {"13", "14", "15", "16"}
                        });
                    }
                }
        );
    }
}


