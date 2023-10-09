package com.daixiaoyu.daixiaoyuleetcode.middle.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 反转字符串中的单词Test {
    反转字符串中的单词 main = new 反转字符串中的单词();

    @Test
    void reverseWords() {
        String str1 = "the sky is blue";
        String expect1 = "blue is sky the";
        assertEquals(expect1, main.reverseWords(str1));

        String str2 = "   hello world  ";
        String expect2 = "world hello";
        assertEquals(expect2, main.reverseWords(str2));

        String str3 = "a good   example";
        String expect3 = "example good a";
        assertEquals(expect3, main.reverseWords(str3));
    }
}