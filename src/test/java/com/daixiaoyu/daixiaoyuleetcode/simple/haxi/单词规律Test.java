package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 单词规律Test {
    单词规律 main = new 单词规律();

    @Test
    void wordPattern() {
        assertTrue(main.wordPattern("abba", "dog cat cat dog"));
        assertFalse(main.wordPattern("abba", "dog cat cat fish"));
        assertFalse(main.wordPattern("aaaa", "dog cat cat dog"));
    }
}