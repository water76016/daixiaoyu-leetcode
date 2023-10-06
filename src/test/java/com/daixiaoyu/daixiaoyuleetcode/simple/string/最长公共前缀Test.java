package com.daixiaoyu.daixiaoyuleetcode.simple.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 最长公共前缀Test {
    最长公共前缀 main = new 最长公共前缀();

    @Test
    void longestCommonPrefix() {
        String[] strs1 = {"flower", "flow", "flight"};
        assertEquals("fl", main.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        assertEquals("", main.longestCommonPrefix(strs2));
    }
}