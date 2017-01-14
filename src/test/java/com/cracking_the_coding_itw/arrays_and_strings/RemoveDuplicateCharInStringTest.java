package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.RemoveDuplicateCharInString;

public class RemoveDuplicateCharInStringTest {

    private RemoveDuplicateCharInString removeDuplicateCharInString = new RemoveDuplicateCharInString();

    @Test
    public void solution() {
        char[] A = new char[] { 'A', 'B', 'A', 'B', 'C'};
        char[] expectedSolution = new char[] { 'A', 'B', 'C', '\u0000', '\u0000'};
        removeDuplicateCharInString.solution(A);
        Assert.assertArrayEquals(expectedSolution, A);
    }

    @Test
    public void solution_with_string() {
        String s = "AIEUE";
        String expectedSolution = "AIEU";
        String solution = removeDuplicateCharInString.solution(s);
        Assert.assertEquals(expectedSolution, solution);
    }

}
