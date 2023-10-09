package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 判断子序列Test {
    判断子序列 main = new 判断子序列();

    @Test
    void isSubsequence() {
        assertTrue(main.isSubsequence("abc", "ahbgdc"));
        assertFalse(main.isSubsequence("axc", "ahbgdc"));
    }
}