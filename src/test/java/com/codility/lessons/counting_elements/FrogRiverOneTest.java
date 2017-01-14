package com.codility.lessons.counting_elements;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {

    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void test() {
        int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
        int expectedSolution = 6;
        int solution = frogRiverOne.solution(5, A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test2() {
        int[] A = new int[] { 1, 3, 1 };
        int expectedSolution = -1;
        int solution = frogRiverOne.solution(3, A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
