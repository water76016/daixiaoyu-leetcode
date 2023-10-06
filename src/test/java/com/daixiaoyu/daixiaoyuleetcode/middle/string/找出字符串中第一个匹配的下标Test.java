package com.daixiaoyu.daixiaoyuleetcode.middle.string;

import com.daixiaoyu.daixiaoyuleetcode.simple.string.找出字符串中第一个匹配的下标;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 找出字符串中第一个匹配的下标Test {
    找出字符串中第一个匹配的下标 main = new 找出字符串中第一个匹配的下标();

    @Test
    void strStr() {
        assertEquals(0, main.strStr("sadbutsad", "sad"));
        assertEquals(-1, main.strStr("leetcode", "leeto"));
    }
}