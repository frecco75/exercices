package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void test_array() {
        int[] A = new int[] { 2, 3, 1, 5 };
        int expectedSolution = 4;
        int solution = permMissingElem.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_array_without_missing_value() {
        int[] A = new int[] { 2, 3, 1, 4 };
        int expectedSolution = 5;
        int solution = permMissingElem.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_empty_array() {
        int[] A = new int[] {};
        int expectedSolution = 1;
        int solution = permMissingElem.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
