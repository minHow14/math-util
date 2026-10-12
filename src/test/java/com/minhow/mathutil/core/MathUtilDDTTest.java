package com.minhow.mathutil.core;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static com.minhow.mathutil.core.MathUtil.getFactorial;

class MathUtilDDTTest {

    // Chuẩn bị riêng data test ra 1 chỗ - DDT - data driven testing
    public static Object[][] initTestData() {
        Object[][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;
    }

    //Test nè, nhồi data trên vào hàm assertEquals()
    @ParameterizedTest //sánh ngang vai với DDT
    @MethodSource("initTestData")
    public void testFactorialGivenValidRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
}