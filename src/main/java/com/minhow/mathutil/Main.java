package com.minhow.mathutil;

import com.minhow.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //TDD - viết code bắt đầu từ viết test
        testFactorialGivenValidN5ReturnsWell120();
    }

    //test hàm tính giai thường n = 5 và hy vọng trả về 120, thực tế đoán xem
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        //sout tab
        System.out.println("Check 5! | expected: " + expected + " | actual: " + actual);

        //Code ny dùng để test code chính, test code base, thì code này gọi là test script
        
    }
}
