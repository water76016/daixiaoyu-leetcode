package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * @version: v1.0.0
 * @create: 2023-10-14 17:14
 **/
public class 赎金信 {
    /**
     * @author: water76016
     * @createTime: 2023年10月14 17:16:33
     * @description: 由于只有小写字母，使用整型数组来代替map，记录ransomNate的字符数量，
     * 如果magazine不够，则返回fasle
     * @param: ransomNote
     * @param: magazine
     * @return: boolean
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.length() == 0){
            return true;
        }
        if (magazine == null){
            return false;
        }
        int[] nums = new int[256];
        for (char c : magazine.toCharArray()){
            nums[c]++;
        }
        for (char c : ransomNote.toCharArray()){
            if (nums[c] <= 0){
                return false;
            }
            nums[c]--;
        }
        return true;
    }
}
