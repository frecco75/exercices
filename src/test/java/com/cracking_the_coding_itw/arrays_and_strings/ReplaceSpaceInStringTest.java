package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.ReplaceSpaceInString;

public class ReplaceSpaceInStringTest {

    private ReplaceSpaceInString replaceSpaceInString = new ReplaceSpaceInString();

    @Test
    public void test_string() {
        String input = "Mr John Smith      ";
        String expectedOutput = "Mr%20John%20Smith";
        String output = replaceSpaceInString.solution(input);
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void test_char_array() {
        String stringInput = "Mr John Smith      ";
        String expectedSringOutput = "Mr%20John%20Smith  ";

        char[] input = stringInput.toCharArray();
        char[] expectedOutput = expectedSringOutput.toCharArray();
        int length = expectedSringOutput.replaceAll("%20", "").length();

        char[] output = replaceSpaceInString.urlify(input, length);
        Assert.assertArrayEquals(expectedOutput, output);
    }

}
