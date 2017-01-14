package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.Anagram;

public class AnagramTest {

    private Anagram anagram = new Anagram();

    @Test
    public void anagram_test() {
        String s1 = "Tom Marvolo Riddle";
        String s2 = "I am Lord Voldemort";
        boolean solution = anagram.solution(s1, s2);
        Assert.assertTrue(solution);
    }

    @Test
    public void no_anagram_test() {
        String s1 = "hello world";
        String s2 = "hello world xoxo";
        boolean solution = anagram.solution(s1, s2);
        Assert.assertFalse(solution);
    }

}
