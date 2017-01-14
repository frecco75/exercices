package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class PrefixSetTest {

    private PrefixSet prefixSet = new PrefixSet();

    @Test
    public void prefixSet_test() {
        int[] A = new int[] {2, 2, 1, 0, 1};
        int expectedSolution = 3;
        int solution = prefixSet.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
