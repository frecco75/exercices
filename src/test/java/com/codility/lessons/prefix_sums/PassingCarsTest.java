package com.codility.lessons.prefix_sums;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    private PassingCars passingCars = new PassingCars();

    @Test
    public void test() {
        int[] A = new int[] { 0, 1, 0, 1, 1 };
        int expectedSolution = 5;
        int solution = passingCars.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_2() {
        int[] A = new int[] { 0, 1, 0 };
        int expectedSolution = 1;
        int solution = passingCars.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_3() {
        int[] A = new int[] { 0, 0, 0, 1 };
        int expectedSolution = 3;
        int solution = passingCars.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }
}
