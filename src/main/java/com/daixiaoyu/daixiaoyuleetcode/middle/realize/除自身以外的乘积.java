package com.daixiaoyu.daixiaoyuleetcode.middle.realize;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在 32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(*n*) 时间复杂度内完成此题。
 * @version: v1.0.0
 * @create: 2023-10-02 10:26
 **/
public class 除自身以外的乘积 {
    /**
     * @author: water76016
     * @createTime: 2023年10月02 10:29:38
     * @description: 使用前缀乘积 + 后缀乘积的方法，来计算除自身以外的乘积
     * @param: nums
     * @return: int[]
     */
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0){
            return nums;
        }
        int length = nums.length;
        int[] prefix = new int[length];
        prefix[0] = nums[0];
        int[] suffix = new int[length];
        suffix[length - 1] = nums[length - 1];
        //计算前缀乘积
        for (int i = 1; i < length; i++){
            prefix[i] = prefix[i - 1] * nums[i];
        }
        //计算后缀乘积
        for (int i = length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i];
        }
        //计算结果集
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            if (i == 0){
                result[i] = suffix[i + 1];
            }
            else if (i == length - 1){
                result[i] = prefix[length - 1 - 1];
            }
            else {
                result[i] = prefix[i - 1] * suffix[i + 1];
            }
        }
        return result;
    }
}
