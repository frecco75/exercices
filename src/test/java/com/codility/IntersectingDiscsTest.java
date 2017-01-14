package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class IntersectingDiscsTest {

    private IntersectingDiscs intersectingDiscs = new IntersectingDiscs();

    @Test
    public void intersectingDiscs_test() {
        int[] A = new int[] {1, 5, 2, 1, 4, 0};
        int expectedSolution = 11;
        int solution = intersectingDiscs.intersectingDiscs(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void intersectingDiscs_test2() {
        int[] A = new int[] {1, 2147483647, 0};
        int expectedSolution = 2;
        int solution = intersectingDiscs.intersectingDiscs(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
