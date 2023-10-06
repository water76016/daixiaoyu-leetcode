package com.daixiaoyu.daixiaoyuleetcode.simple.string;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回 -1 。
 * @version: v1.0.0
 * @create: 2023-10-05 20:23
 **/
public class 找出字符串中第一个匹配的下标 {
    /**
     * @author: water76016
     * @createTime: 2023年10月05 20:42:20
     * @description: 这是常规解法，如果要更快的话，需要KMP算法
     * 每次从其中一个点开始往后匹配，如果全部匹配通过则返回结果
     * 如果有一次不匹配通过，则重新进入下一个点，重新从索引0的位置处开始匹配
     * @param: haystack
     * @param: needle
     * @return: int
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || haystack == null){
            return -1;
        }
        if (needle.length() > haystack.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++){
            //先判断长度还够不够
            if (haystack.length() - i < needle.length()){
                break;
            }
            for (int j = 0; j < needle.length(); j++){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    //说明起始点不是当前i的位置，进入到下一次循环
                    break;
                }
                if (j == needle.length() - 1){
                    //此时找到了结果
                    return i;
                }
            }
        }
        return -1;
    }
}
