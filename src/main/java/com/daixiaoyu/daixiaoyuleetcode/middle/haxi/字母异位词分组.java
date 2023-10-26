package com.daixiaoyu.daixiaoyuleetcode.middle.haxi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * @version: v1.0.0
 * @create: 2023-10-14 17:53
 **/
public class 字母异位词分组 {
    /**
     * @author: water76016
     * @createTime: 2023年10月14 17:55:50
     * @description: 把abcde转换成a1b1c1d1e1这样的格式，
     * 把这样的结果存储在哈希里面，从而能够快速地判断是否在一个分组里面
     * @param: strs
     * @return: java.util.List<java.util.List<java.lang.String>>
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0){
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            String convert = strConvert(str);
            if (map.containsKey(convert)){
                map.get(convert).add(str);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(convert, list);
                result.add(list);
            }
        }
        return result;
    }

    public String strConvert(String str){
        if (str == null){
            return null;
        }
        int[] nums = new int[256];
        for (char c : str.toCharArray()){
            nums[c]++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                char c = (char) i;
                builder.append(c).append(nums[i]);
            }
        }
        return builder.toString();
    }
}
