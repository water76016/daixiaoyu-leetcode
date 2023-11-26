package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N字形变换Test {

    @Test
    void convert() {
        N字形变换 main = new N字形变换();
        assertEquals("PAHNAPLSIIGYIR", main.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", main.convert("PAYPALISHIRING", 4));
    }
}