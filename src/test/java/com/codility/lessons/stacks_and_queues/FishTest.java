package com.codility.lessons.stacks_and_queues;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    private Fish fish = new Fish();

    @Test
    public void test() {
        int[] A = new int[] { 4, 3, 2, 1, 5};
        int[] B = new int[] { 0, 1, 0, 0, 0};
        int expectedSolution = 2;
        int solution = fish.solution(A, B);
        Assert.assertEquals(expectedSolution, solution);
    }

}
