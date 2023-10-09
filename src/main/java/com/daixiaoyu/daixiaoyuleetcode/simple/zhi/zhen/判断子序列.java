package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 进阶：
 * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，
 * 你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 * @version: v1.0.0
 * @create: 2023-10-05 21:58
 **/
public class 判断子序列 {
    /**
     * @author: water76016
     * @createTime: 2023年10月05 22:00:55
     * @description: 使用两个指针，从起点开始，如果两个指针相等，则都进一步。
     * 如果两个指针不相等，则T的进一步。
     * 最后判断S的指针是否指向最后即可
     * @param: s
     * @param: t
     * @return: boolean
     */
    public boolean isSubsequence(String s, String t) {
        if (s == null){
            return true;
        }
        if (t == null){
            return false;
        }
        int sPoint = 0;
        for (int i = 0; i < t.length(); i++){
            if (sPoint < s.length() && s.charAt(sPoint) == t.charAt(i)){
                sPoint++;
            }
        }
        if (sPoint >= s.length()){
            return true;
        }
        return false;
    }
}
