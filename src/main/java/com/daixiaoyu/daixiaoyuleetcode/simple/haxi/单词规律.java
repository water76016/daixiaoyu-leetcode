package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 * @version: v1.0.0
 * @create: 2023-10-14 14:26
 **/
public class 单词规律 {
    //使用哈希进行存储，如果发现规律不相同则直接返回false
    //注意要用两个哈希map，不然可能存在abba和dog dog dog dog这样不满足匹配条件的情况出现
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null && s == null){
            return true;
        }
        if (pattern == null || s == null){
            return false;
        }
        String[] strs = s.split(" ");
        //两者的长度要相同才行
        if (pattern.length() != strs.length){
            return false;
        }
        Map<String, Character> mapString = new HashMap<>();
        Map<Character, String> mapChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = strs[i];


            if (mapChar.containsKey(c)){
                if (mapChar.get(c).equals(str) && mapString.containsKey(str) && mapString.get(str) == c){
                    continue;
                }
                return false;
            }
            else {
                //这里要加上，因为会存在abc /    dog cat dog这样的情况
                if (mapString.containsKey(str)){
                    return false;
                }
                mapChar.put(c, str);
                mapString.put(str, c);
            }
        }
        return true;
    }
}
