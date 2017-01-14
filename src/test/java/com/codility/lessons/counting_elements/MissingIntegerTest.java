package com.codility.lessons.counting_elements;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void test() {
        int[] A = new int[] { 1, 3, 6, 4, 1, 2 };
        int expectedSolution = 5;
        int solution = missingInteger.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_single() {
        int[] A = new int[] { -1 };
        int expectedSolution = 1;
        int solution = missingInteger.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_duo() {
        int[] A = new int[] { 1, 1 };
        int expectedSolution = 2;
        int solution = missingInteger.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_trio() {
        int[] A = new int[] { 1, 2, 3 };
        int expectedSolution = 4;
        int solution = missingInteger.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }


}
