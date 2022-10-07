package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {
    @Test public void WordCount_babablacksheep_should_produce_211() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);

        String[] words = new String[]{"ba", "ba", "black", "sheep"};

        Map<String,Integer> result = wordCount.getCount(words);

        // assert
        Assert.assertEquals("Did not output expected value", expected, result);
    }

    @Test public void WordCount_abacb_should_produce_221() {
        WordCount wordCount = new WordCount();
        Map<String , Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);

        String[] words = new String[]{"a", "b", "a", "c", "b"};

        Map<String,Integer> result = wordCount.getCount(words);

        // assert
        Assert.assertEquals("Did not output expected value", expected, result);
    }

    @Test public void WordCount_blank_should_produce_blank() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();

        String[] words = new String[]{};
        Map<String,Integer> result = wordCount.getCount(words);

        // assert
        Assert.assertEquals("Did not output expected value", expected, result);
    }

    @Test public void WordCount_cba_should_produce_111() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("c", 1);
        expected.put("b", 1);
        expected.put("a", 1);

        String[] words = new String[]{"c", "b", "a"};
        Map<String,Integer> result = wordCount.getCount(words);

        // assert
        Assert.assertEquals("Did not output expected value", expected, result);
    }
}
