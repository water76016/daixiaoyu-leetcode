package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2023-10-05 12:03
 **/
public class 整数转罗马数字 {
    public String intToRoman(int num) {
        if (num <= 0){
            return "";
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5,"V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        List<Integer> list = map.keySet().stream().sorted().collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        //有大的先用大的
        while (num > 0){
            for (int i = list.size() - 1; i >= 0; i--){
                if (list.get(i) <= num){
                    String str = map.get(list.get(i));
                    builder.append(str);
                    num = num - list.get(i);
                    break;
                }
            }
        }
        return builder.toString();
    }
}
