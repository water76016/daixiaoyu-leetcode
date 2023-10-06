package com.daixiaoyu.daixiaoyuleetcode.simple.string;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * @version: v1.0.0
 * @create: 2023-10-05 15:13
 **/
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        //利用一个标志位来判断一个单词的前后
        boolean lastEmpty = true;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if (c != ' '){
                lastEmpty = false;
                result++;
            }
            else {
                if (lastEmpty){
                    //这里说明从刚开始一直遍历的都是空格，所以可以一直跳过
                    continue;
                }
                else {
                    break;
                }
            }
        }
        return result;
    }
}
