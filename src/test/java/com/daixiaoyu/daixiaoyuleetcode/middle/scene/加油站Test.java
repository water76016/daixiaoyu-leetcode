package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 加油站Test {
    加油站 main = new 加油站();

    @Test
    void canCompleteCircuit() {
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        int expect = 3;
        int actual = main.canCompleteCircuit(gas1, cost1);
        assertEquals(3, actual);

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        int expect2 = -1;
        int actual2 = main.canCompleteCircuit(gas2, cost2);
        assertEquals(expect2, actual2);

        int[] gas3 = {3, 1, 1};
        int[] cost3 = {1, 2, 2};
        int actual3 = main.canCompleteCircuit(gas3, cost3);
        assertEquals(0, actual3);


    }
}