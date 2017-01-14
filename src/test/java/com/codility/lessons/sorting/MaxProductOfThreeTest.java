package com.codility.lessons.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {

    private MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void test() {
        int[] A = new int[] { -3, 1, 2, -2, 5, 6 };
        int expectedSolution = 60;
        int solution = maxProductOfThree.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
