package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 整数转罗马数字Test {
    整数转罗马数字 main = new 整数转罗马数字();

    @Test
    void intToRoman() {
        assertEquals("III", main.intToRoman(3));
        assertEquals("IV", main.intToRoman(4));
        assertEquals("IX", main.intToRoman(9));
        assertEquals("LVIII", main.intToRoman(58));
        assertEquals("MCMXCIV", main.intToRoman(1994));
        assertEquals("XX", main.intToRoman(20));
    }
}