package com.daixiaoyu.daixiaoyuleetcode.simple.zhi.zhen;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，
 * 短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 *
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 * @version: v1.0.0
 * @create: 2023-10-05 21:09
 **/
public class 验证回文串 {
    /**
     * @author: water76016
     * @createTime: 2023年10月05 21:15:08
     * @description: 使用双指针进行判断即可，处理的时候记得跳过非字母数字字符
     * @param: s
     * @return: boolean
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0){
            return true;
        }
        //先把s都处理成小写
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right){
            while (left <= s.length() - 1 && isOtherChar(s.charAt(left))){
                left++;
            }
            while (right >= 0 && isOtherChar(s.charAt(right))){
                right--;
            }
            //比较左右两边两个指针字符是否相同
            if (left <= s.length() - 1 && right >= 0 && s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isOtherChar(char c){
        if (c >= 'a' && c <= 'z'){
            return false;
        }
        if (c >= 'A' && c <= 'Z'){
            return false;
        }
        if (c >= '0' && c <= '9'){
            return false;
        }
        return true;
    }
}
