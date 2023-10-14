package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 赎金信Test {
    赎金信 main = new 赎金信();

    @Test
    void canConstruct() {
        assertFalse(main.canConstruct("a", "b"));
        assertFalse(main.canConstruct("aa", "ab"));
        assertTrue(main.canConstruct("aa", "aab"));
    }
}