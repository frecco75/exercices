package com.codility.lessons.arrays;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void test() {
        int[] A = new int[] { 3, 8, 9, 7, 6 };
        int[] expectedSolution = new int[] { 6, 3, 8, 9, 7 };
        int[] solution = cyclicRotation.solution(A, 1);
        Assert.assertArrayEquals(expectedSolution, solution);
    }

    @Test
    public void test2() {
        int[] A = new int[] { 3, 8, 9, 7, 6 };
        int[] expectedSolution = new int[] { 9, 7, 6, 3, 8 };
        int[] solution = cyclicRotation.solution(A, 3);
        Assert.assertArrayEquals(expectedSolution, solution);
    }

}
