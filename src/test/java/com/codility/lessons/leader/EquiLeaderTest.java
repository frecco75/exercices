package com.codility.lessons.leader;

import org.junit.Assert;
import org.junit.Test;

public class EquiLeaderTest {

    private EquiLeader equiLeader = new EquiLeader();

    @Test
    public void test() {
        int[] A = new int[] { 4, 3, 4, 4, 4, 2};
        int expectedSolution = 2;
        int solution = equiLeader.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
