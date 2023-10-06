package com.daixiaoyu.daixiaoyuleetcode.simple.string;

import com.daixiaoyu.daixiaoyuleetcode.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 最后一个单词的长度Test {
    最后一个单词的长度 main = new 最后一个单词的长度();

    @Test
    void lengthOfLastWord() {
        assertEquals(5, main.lengthOfLastWord("Hello World"));
        assertEquals(4, main.lengthOfLastWord("fly me to the moon"));
        assertEquals(6, main.lengthOfLastWord("luffy is still joyboy"));
    }
}