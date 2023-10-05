package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 两数之和2输入有序数组Test {
    两数之和2输入有序数组 main = new 两数之和2输入有序数组();

    @Test
    void twoSum() {
        int[] numbers1 = {2, 7, 11, 15};
        int[] expect1 = {1, 2};
        int[] actual1 = main.twoSum(numbers1, 9);
        assertArrayEquals(expect1, actual1);

        int[] numbers2 = {2, 3, 4};
        int[] expect2 = {1, 3};
        int[] actual2 = main.twoSum(numbers2, 6);
        assertArrayEquals(expect2, actual2);

    }
}