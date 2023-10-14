package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 同构字符串Test {
    同构字符串 main = new 同构字符串();

    @Test
    void isIsomorphic() {
        assertTrue(main.isIsomorphic("egg", "add"));
        assertFalse(main.isIsomorphic("foo", "bar"));
        assertTrue(main.isIsomorphic("paper", "title"));
    }
}