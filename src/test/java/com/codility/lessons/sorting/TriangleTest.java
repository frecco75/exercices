package com.codility.lessons.sorting;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void test() {
        int[] A = new int[] { 10, 2, 5, 1, 8, 20 };
        int expectedSolution = 1;
        int solution = triangle.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test2() {
        int[] A = new int[] { 10, 50, 5, 1 };
        int expectedSolution = 0;
        int solution = triangle.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }
}
