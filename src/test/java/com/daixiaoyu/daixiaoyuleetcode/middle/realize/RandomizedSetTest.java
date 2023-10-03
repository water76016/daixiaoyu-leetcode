package com.daixiaoyu.daixiaoyuleetcode.middle.realize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void verfiy() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(0));
        assertTrue(randomizedSet.insert(1));
        assertTrue(randomizedSet.remove(0));
        assertTrue(randomizedSet.insert(2));
        assertTrue(randomizedSet.remove(1));
        int ranVal = randomizedSet.getRandom();
        assertEquals(2, ranVal);
    }
}