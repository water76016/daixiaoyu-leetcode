package com.daixiaoyu.daixiaoyuleetcode.middle.realize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 除自身以外的乘积Test {
    除自身以外的乘积 main = new 除自身以外的乘积();

    @Test
    void productExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int[] expect = {24, 12, 8, 6};
        int[] result = main.productExceptSelf(nums);
        assertArrayEquals(expect, result);

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] expect2 = {0, 0, 9, 0, 0};
        int[] result2 = main.productExceptSelf(nums2);
        assertArrayEquals(expect2, result2);
    }
}