package com.daixiaoyu.daixiaoyuleetcode.simple.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，
 * 满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 * @version: v1.0.0
 * @create: 2023-10-13 20:29
 **/
public class 存在重复元素2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return false;
        }
        //使用map保存值以及对应的下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int value = nums[i];
            if (map.containsKey(value)){
                if (i - map.get(value) <= k){
                    return true;
                }
                else {
                    //暂时不满足条件，替换下标
                    map.put(value, i);
                }
            }
            else {
                map.put(value, i);
            }
        }
        return false;
    }
}
