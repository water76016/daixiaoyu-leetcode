package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 盛最多水的容器Test {
    盛最多水的容器 main = new 盛最多水的容器();

    @Test
    void maxArea() {
        int[] nums1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, main.maxArea(nums1));

        int[] nums2 = {1, 1};
        assertEquals(1, main.maxArea(nums2));
    }
}