package com.daixiaoyu.daixiaoyuleetcode.simple.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class H指数Test {
    H指数 main = new H指数();

    @Test
    void hIndex() {
        int[] citations = {3, 0, 6, 1, 5};
        int actual = main.hIndex(citations);
        assertEquals(3, actual);

        int[] citations2 = {1, 3, 1};
        int actual2 = main.hIndex(citations2);
        assertEquals(1, actual2);

        int[] citations3 = {11, 15};
        int actual3 = main.hIndex(citations3);
        assertEquals(2, actual3);
    }
}