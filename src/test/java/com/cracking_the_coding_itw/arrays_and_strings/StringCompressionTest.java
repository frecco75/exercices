package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.StringCompression;


public class StringCompressionTest {

    private StringCompression compression = new StringCompression();

    @Test
    public void test() {
        String s = "aabcccccaaa";
        String expected = "a2bc5a3";
        String output = compression.compress(s);
        Assert.assertEquals(expected, output);
    }

}
