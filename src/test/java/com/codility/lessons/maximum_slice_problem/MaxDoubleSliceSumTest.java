package com.codility.lessons.maximum_slice_problem;

import org.junit.Assert;
import org.junit.Test;

public class MaxDoubleSliceSumTest {

    private MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

    @Test
    public void test() {
        int[] A = new int[] { 3, 2, 6, -1, 4, 5, -1, 2 };
        int expectedSolution = 17;
        int solution = maxDoubleSliceSum.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
