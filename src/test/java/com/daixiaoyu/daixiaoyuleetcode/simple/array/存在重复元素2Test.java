package com.daixiaoyu.daixiaoyuleetcode.simple.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 存在重复元素2Test {
    存在重复元素2 main = new 存在重复元素2();

    @Test
    void containsNearbyDuplicate() {
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(main.containsNearbyDuplicate(nums1, 3));

        int[] nums2 = {1, 0, 1, 1};
        assertTrue(main.containsNearbyDuplicate(nums2, 1));

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        assertFalse(main.containsNearbyDuplicate(nums3, 2));
    }
}