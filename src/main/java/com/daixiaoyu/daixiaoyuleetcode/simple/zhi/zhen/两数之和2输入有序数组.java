package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列 ，
 * 请你从数组中找出满足相加之和等于目标数 target 的两个数。
 * 如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，
 * 则 1 <= index1 < index2 <= numbers.length 。
 *
 *
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 *
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 * 你所设计的解决方案必须只使用常量级的额外空间。
 * @version: v1.0.0
 * @create: 2023-10-05 22:10
 **/
public class 两数之和2输入有序数组 {
    /**
     * @author: water76016
     * @createTime: 2023年10月05 22:12:15
     * @description: 使用两个指针，分别指向开头和结果
     * 由于是非递减的，那么如果两个指针的值相加小于目标值，说明较小，则左边的指针加1
     * 否则右边的指针加1
     * @param: numbers
     * @param: target
     * @return: int[]
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            if (numbers[left] + numbers[right] < target){
                left++;
            }
            else if (numbers[left] + numbers[right] > target){
                right--;
            }
            else {
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
