package com.daixiaoyu.daixiaoyuleetcode.middle.realize;

import java.util.*;

/**
 * @program: daixiaoyu-leetcode
 * @author: water76016
 * @description:
 *

实现RandomizedSet 类：
- RandomizedSet() 初始化 RandomizedSet 对象
- bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
- bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
- int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1)
 * @version: v1.0.0
 * @create: 2023-10-01 10:55
 **/
public class RandomizedSet {
    //key是放入的值，value是该值在list中的下标，方便随机返回一个数的时候使用
    Map<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        //把新的值放到list的末尾
        list.add(val);
        int size = list.size();
        map.put(val, size - 1);
        return true;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)){
            //找到这个值在list里面的下标并移除
            int index = map.get(val);
            list.remove(index);
            //从map里面删除这个元素
            map.remove(val);
            //移除某个元素之后，这个元素位置之后的所有元素在map里面的下标，都需要进行减1，这里是关键
            for (int i = index; i < list.size(); i++){
                int num = list.get(i);
                map.put(num, map.get(num) - 1);
            }
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random ran = new Random();
        int index = ran.nextInt(list.size());
        return list.get(index);
    }

    /**
     * 删除操作的官方题解
     * 1.
     */
}
