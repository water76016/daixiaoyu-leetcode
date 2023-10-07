package com.daixiaoyu.daixiaoyuleetcode.simple.scene;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2023-10-04 00:38
 **/
public class 罗马数字转整数 {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        for (int i = 0; i < s.length() - 1; i++){
            int cur = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            //比较当前和后面那一个的大小，若前面比后面小，说明需要做减法，否则需要做加法
            if (cur < next){
                total = total - cur;
            }
            else {
                total = total + cur;
            }
        }
        //计算最后一个，最后一个肯定是加法
        total = total + map.get(s.charAt(s.length() - 1));
        return total;
    }
}
