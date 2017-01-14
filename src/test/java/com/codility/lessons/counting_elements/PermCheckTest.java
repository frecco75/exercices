package com.codility.lessons.counting_elements;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    public void test_permutation() {
        int[] A = new int[] { 4, 1, 3, 2 };
        int expectedSolution = 1;
        int solution = permCheck.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_no_permutation() {
        int[] A = new int[] { 4, 1, 3 };
        int expectedSolution = 0;
        int solution = permCheck.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
