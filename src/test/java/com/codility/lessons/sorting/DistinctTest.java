package com.codility.lessons.sorting;

import org.junit.Assert;
import org.junit.Test;


public class DistinctTest {

    private Distinct distinct = new Distinct();

    @Test
    public void test() {
        int[] A = new int[] { 2, 1, 1, 2, 3, 1 };
        int expectedSolution = 3;
        int solution = distinct.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
