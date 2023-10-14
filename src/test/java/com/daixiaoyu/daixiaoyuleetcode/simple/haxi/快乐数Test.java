package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 快乐数Test {
    快乐数 main = new 快乐数();
    @Test
    void isHappy() {
        assertTrue(main.isHappy(19));
        assertFalse(main.isHappy(2));
    }
}