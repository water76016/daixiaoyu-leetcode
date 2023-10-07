package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 验证回文串Test {
    验证回文串 main = new 验证回文串();

    @Test
    void isPalindrome() {
        assertTrue(main.isPalindrome("A man, a plan, acanal: panama"));
        assertFalse(main.isPalindrome("race a car"));
        assertTrue(main.isPalindrome(" "));
        assertFalse(main.isPalindrome("0P"));
    }
}