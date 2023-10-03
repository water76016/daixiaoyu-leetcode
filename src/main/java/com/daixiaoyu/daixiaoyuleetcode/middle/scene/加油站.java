package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。
 * 你从其中的一个加油站出发，开始时油箱为空。
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。
 * 如果存在解，则 保证 它是 唯一 的。
 * @version: v1.0.0
 * @create: 2023-10-02 22:58
 **/
public class 加油站 {
    /**
     * @author: water76016
     * @createTime: 2023年10月02 22:59:34
     * @description: 假设从 X 到 Z 刚好到达 Y，那么从 X 到 Z的任何一个点，都不可能超过 Y
     * 因为长距离都只是刚好到达，中间的任何一个点，都不可能有多余的油
     * 那么，我们从0开始，如果能走完全程的话，那就返回结果。
     * 如果从x点发现不能往前走了，那就继续新的过程，起点从x点开始走
     * 如果遍历一遍都没结果的话，就返回-1
     *
     * 解答2：
     * 把油的总量和耗油量都相加，如果剩余的油大于等于0，则一定能跑完一圈。
     * 剩下的，只是判断对应的位置了。那么，如果从x-y，剩余的油小于0，那么题解肯定不在x->y的范围内
     * 肯定在后面的某个位置里面
     * @param: cost
     * @return: int
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remain = 0;
        int total = 0;
        int result = 0;
        if (gas == null || gas.length == 0){
            return -1;
        }
        for (int i = 0; i < gas.length; i++){
            remain = remain + gas[i] - cost[i];
            total = total + gas[i] - cost[i];
            if (remain < 0){
                //说明走不到i这个位置，那么答案肯定在i位置的后面
                result = i + 1;
                //重新将这个点的剩余油量置为0
                remain = 0;
            }
        }
        if (total >= 0){
            return result;
        }
        return -1;
    }
}
