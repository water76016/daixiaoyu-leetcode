package com.daixiaoyu.daixiaoyuleetcode.middle.string;

import java.util.*;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 *
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 *
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 *
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。
 * 返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * @version: v1.0.0
 * @create: 2023-10-05 15:39
 **/
public class 反转字符串中的单词 {
    public String reverseWords(String s) {

        if (s == null || s.length() == 0){
            return s;
        }
        Deque<String> deque = new LinkedList<>();
        //判断是不是一个空字符的标志位
        boolean isChar = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != ' '){
                isChar = true;
                builder.append(c);
            }
            else {
                if (isChar){
                    //这里已经可以判断出有前后两次空格了
                    deque.addFirst(builder.toString());
                    isChar = false;
                    builder = new StringBuilder();
                }
                else {
                    continue;
                }
            }
        }
        //如果build不为空，把最后的这个字符串也放到栈里面
        if (builder.length() > 0){
            deque.addFirst(builder.toString());
        }

        //把栈里面的东西逆序弹出来，放到结果集里面
        StringBuilder result = new StringBuilder();
        while (deque.size() > 0){
            String str = deque.pollFirst();
            result.append(str);
            if (deque.size() > 0){
                //还不为空，就加一个空格进去
                result.append(' ');
            }
        }
        return result.toString();
    }

    public String reverseWords_guanfang(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
