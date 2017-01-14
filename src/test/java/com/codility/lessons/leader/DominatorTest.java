package com.codility.lessons.leader;

import org.junit.Assert;
import org.junit.Test;

public class DominatorTest {

    private Dominator dominator = new Dominator();

    @Test
    public void test() {
        int A[] = new int[] { 3, 4, 3, 2, 3, -1, 3, 3 };
        int expectedSolution = 0;
        int solution = dominator.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
