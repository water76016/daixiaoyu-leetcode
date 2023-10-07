package com.daixiaoyu.daixiaoyuleetcode.simple.scene;

import com.daixiaoyu.daixiaoyuleetcode.simple.scene.罗马数字转整数;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 罗马数字转整数Test {
    罗马数字转整数 main = new 罗马数字转整数();

    @Test
    void romanToInt() {
        assertEquals(3, main.romanToInt("III"));
        assertEquals(4, main.romanToInt("IV"));
        assertEquals(9, main.romanToInt("IX"));
        assertEquals(58, main.romanToInt("LVIII"));
        assertEquals(1994, main.romanToInt("MCMXCIV"));
    }
}