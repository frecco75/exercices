package com.codility.lessons.stacks_and_queues;

import org.junit.Assert;
import org.junit.Test;

public class StoneWallTest {

    private StoneWall stoneWall = new StoneWall();

    @Test
    public void test() {
        int[] H = new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
        int expectedSolution = 7;
        int solution = stoneWall.solution(H);
        Assert.assertEquals(expectedSolution, solution);
    }

}
