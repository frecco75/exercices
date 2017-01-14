package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.ReverseCStyleString;

public class ReverseCStyleStringTest {

    private ReverseCStyleString reverseCStyleString = new ReverseCStyleString();

    @Test
    public void test() {
        String s = "abcd";
        String expectedString = "dcba";
        String reverseString = reverseCStyleString.solution(s);
        Assert.assertEquals(expectedString, reverseString);
    }

}
