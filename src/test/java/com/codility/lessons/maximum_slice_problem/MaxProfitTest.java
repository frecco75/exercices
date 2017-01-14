package com.codility.lessons.maximum_slice_problem;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    private MaxProfit maxProfit = new MaxProfit();

    @Test
    public void test() {
        int[] A = new int[] { 23171, 21011, 21123, 21366, 21013, 21367};
        int expectedSolution = 356;
        int solution = maxProfit.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
