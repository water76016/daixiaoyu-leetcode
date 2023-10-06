package com.daixiaoyu.daixiaoyuleetcode.simple.string;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * @version: v1.0.0
 * @create: 2023-10-05 15:22
 **/
public class 最长公共前缀 {
    /**
     * @author: water76016
     * @createTime: 2023年10月05 15:24:41
     * @description: 从0开始，遍历每个字符串，看是否相等，如果相等说明是一个前缀字符
     * 否则退出
     * @param: strs
     * @return: java.lang.String
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++){
            //作为起始的前缀
            char prefixChar = strs[0].charAt(i);
            //遍历每一个字符串，看是否与起始的前缀相同
            for (int j = 1; j < strs.length; j++){
                //注意这里起始字符串可能比其他字符串要长
                if (strs[j].length() < i + 1 || prefixChar != strs[j].charAt(i)){
                    return builder.toString();
                }
            }
            builder.append(prefixChar);
        }
        return builder.toString();
    }
}
