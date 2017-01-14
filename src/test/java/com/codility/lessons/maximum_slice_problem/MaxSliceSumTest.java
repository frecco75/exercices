package com.codility.lessons.maximum_slice_problem;

import org.junit.Assert;
import org.junit.Test;

public class MaxSliceSumTest {

    private MaxSliceSum maxSliceSum = new MaxSliceSum();

    @Test
    public void test() {
        int[] A = new int[] { 3, 2, -6, 4, 0 };
        int expectedSolution = 5;
        int solution = maxSliceSum.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
