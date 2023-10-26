package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给定两个字符串 *s* 和 *t* ，编写一个函数来判断 *t* 是否是 *s* 的字母异位词。
 *
 * 注意：若 *s* 和 *t* 中每个字符出现的次数都相同，则称 *s* 和 *t* 互为字母异位词。
 * @version: v1.0.0
 * @create: 2023-10-14 17:47
 **/
public class 有效的字母异位词 {
    /**
     * @author: water76016
     * @createTime: 2023年10月14 17:49:21
     * @description: 由于是字符，可以用数组代替哈希来统计字符的次数
     * @param: s
     * @param: t
     * @return: boolean
     */
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        //先判断两者的长度是否相同，不同返回false
        if (s.length() != t.length()){
            return false;
        }
        int[] nums = new int[256];
        for (char c : s.toCharArray()){
            nums[c]++;
        }
        for (char c : t.toCharArray()){
            if (nums[c] <= 0){
                return false;
            }
            nums[c]--;
        }
        return true;
    }
}
