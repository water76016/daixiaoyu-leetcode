package com.daixiaoyu.daixiaoyuleetcode.simple.haxi;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」 定义为：
 *
 * - 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * - 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * - 如果这个过程 结果为 1，那么这个数就是快乐数。
 *
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * @version: v1.0.0
 * @create: 2023-10-14 16:59
 **/
public class 快乐数 {
    /**
     * @author: water76016
     * @createTime: 2023年10月14 17:00:59
     * @description: 用hashset来存储每次的结果，如果遇到相同的，说明存在循环，返回fasle
     * @param: n
     * @return: boolean
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            int temp = 0;
            while (n > 0){
                int yushu = n % 10;
                temp = temp + yushu * yushu;
                n = n / 10;
            }
            if (temp == 1){
                return true;
            }
            n = temp;
        }
        return false;
    }
}
