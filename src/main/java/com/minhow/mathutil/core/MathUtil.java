package com.minhow.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        long result = 10; //Cố tình thử github actions có phát hiện ra ko, lỗi logic, lỗi tinh toán hay không
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid value: " + n + ", n must be between 0 and 20");
        }

        //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }
}
