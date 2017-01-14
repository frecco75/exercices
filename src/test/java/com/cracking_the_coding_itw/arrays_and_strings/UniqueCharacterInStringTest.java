package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.UniqueCharacterInString;

public class UniqueCharacterInStringTest {

    private UniqueCharacterInString uniqueCharacterInString = new UniqueCharacterInString();

    @Test
    public void success_test() {
        String s = "easy coding!";
        boolean solution = uniqueCharacterInString.solution(s);
        Assert.assertTrue(solution);
    }

    @Test
    public void failure_test() {
        String s = "toto";
        boolean solution = uniqueCharacterInString.solution(s);
        Assert.assertFalse(solution);
    }

    @Test
    public void success_without_additional_data_structure_test() {
        String s = "easy coding!";
        boolean solution = uniqueCharacterInString.solutionWithoutAdditionalDataStructure(s);
        Assert.assertTrue(solution);
    }

    @Test
    public void failure_without_additional_data_structure_test() {
        String s = "toto";
        boolean solution = uniqueCharacterInString.solutionWithoutAdditionalDataStructure(s);
        Assert.assertFalse(solution);
    }
}
