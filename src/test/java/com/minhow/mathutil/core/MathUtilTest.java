package com.minhow.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.minhow.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    // Test case 1: test hàm với đầu vào hợp lệ, n = 5
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        // So sánh tự động giúp tôi expected == actual hay không
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ
        assertEquals(expected, actual);

    }

    // Test case 2: test hàm với đầu vào hợp lệ, n = 6
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        // So sánh tự động giúp tôi expected == actual hay không
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ
        assertEquals(expected, actual);

    }

    // Test case 3: test hàm với đầu vào hợp lệ, n = 0
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        // So sánh tự động giúp tôi expected == actual hay không
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ
        assertEquals(expected, actual);

    }

    // Test case 4: test hàm với đầu vào không hợp lệ, n = -1
    // n = -1, hy vọng hàm: trả về ngoại lệ!!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-1);
        });

    }
}