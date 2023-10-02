package com.daixiaoyu.daixiaoyuleetcode.simple.array;

import java.util.Arrays;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
 * 并且每篇论文 至少 被引用 h 次。如果 h 有多种可能的值，h 指数 是其中最大的那个。
 * @version: v1.0.0
 * @create: 2023-09-30 23:49
 **/
public class H指数 {
    /**
     * @author: water76016
     * @createTime: 2023年09月30 23:51:19
     * @description: 自己的解答：
     * 先对数组进行排序，然后进行值的判断。
     * 设置一个指针，从右往左，如果当前指针的值大于当前的H指数，则H指针加1，指针往左继续移动一次，直到无法移动
     * @param: citations
     * @return: int
     */
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0){
            return 0;
        }
        Arrays.sort(citations);
        int index = citations.length - 1;
        int result = 0;
        while (index >= 0 && citations[index] > result){
            result++;
            index--;
        }
        return result;

    }
}
