package com.daixiaoyu.daixiaoyuleetcode.middle.scene;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 *     P   A   H   N
 *     A P L S I I G
 *     Y   I   R
 *
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * @version: v1.0.0
 * @create: 2023-10-27 01:12
 **/
public class N字形变换 {
    /**
     * @author: water76016
     * @createTime: 2023年10月28 15:24:32
     * @description: 不要被列迷惑了，答案并不关心这个字符在第几列，
     * 关心这个字符在第几行。
     * 那么，仅需要维护一个行号就行，把字符放到对应的行里面，然后最终再组合起来
     * @param: s
     * @param: numRows
     * @return: java.lang.String
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows < 2){
            return s;
        }
        //存储对应的行
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            list.add(new StringBuilder());
        }
        //标记当前是正着遍历还是反着遍历
        boolean flag = true;
        //标记当前的行数
        int cur = 0;
        for (char c : s.toCharArray()){
            list.get(cur).append(c);
            if (cur == numRows - 1){
                flag = false;
            }
            else if (cur == 0){
                flag = true;
            }
            if (flag){
                cur++;
            }
            else {
                cur--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : list){
            result.append(builder);
        }
        return result.toString();
    }
}
