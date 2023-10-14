package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 *
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
 * 不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * @version: v1.0.0
 * @create: 2023-10-14 17:22
 **/
public class 同构字符串 {
    /**
     * @author: water76016
     * @createTime: 2023年10月14 17:37:15
     * @description: 由于字符只能映射到一个字符上，不能映射多个，所以需要采用双射
     * 这里是字符，那么实际上是可以用数组来进行存储的
     * @param: s
     * @param: t
     * @return: boolean
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        int[] sNum = new int[256];
        int[] tNum = new int[256];
        for (int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sNum[sc] == tc && tNum[tc] == sc){
                continue;
            }
            else if (sNum[sc] == 0 && tNum[tc] == 0){
                sNum[sc] = tc;
                tNum[tc] = sc;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
