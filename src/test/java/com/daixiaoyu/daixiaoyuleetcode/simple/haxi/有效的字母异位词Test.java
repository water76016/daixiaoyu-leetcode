package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 有效的字母异位词Test {
    有效的字母异位词 main = new 有效的字母异位词();

    @Test
    void isAnagram() {
        assertTrue(main.isAnagram("anagram", "nagaram"));
        assertFalse(main.isAnagram("rat", "car"));
    }
}