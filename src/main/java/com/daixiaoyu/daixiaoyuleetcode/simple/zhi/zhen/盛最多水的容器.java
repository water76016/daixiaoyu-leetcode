package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 * @version: v1.0.0
 * @create: 2023-10-06 00:36
 **/
public class 盛最多水的容器 {
    /**
     * @author: water76016
     * @createTime: 2023年10月06 00:44:22
     * @description: 根据题意，最后的面积为：（j - i） * Math.min(height[i], height[j])
     * 最开始设置左右两个指针，分别指向两端，向中间移动的话，就会设计到移动长的那块板子还是移动短的那块板子的问题
     * 若移动长板：由于短板不会变，两者的距离减小，则面积一定减小
     * 若移动短板：由于板子可能会增大，所以面积有可能会变大，每次更新最大面积即可
     * 那么，只需要每次移动短的那块板子，然后每次都计算最大值即可，直到两个板子相遇
     * @param: height
     * @return: int
     */
    public int maxArea(int[] height) {
        if (height == null || height.length <= 1){
            return 0;
        }
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            //计算当前面积
            int acreage = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, acreage);
            //每次只移动短的那块板子
            if (height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return result;
    }
}
