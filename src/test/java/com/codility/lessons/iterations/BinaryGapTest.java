package com.codility.lessons.iterations;

import org.junit.Assert;
import org.junit.Test;

import com.codility.lessons.iterations.BinaryGap;

public class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    public void test() {
        int solution = binaryGap.solution(1041);
        int expectedSolution = 5;
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test2() {
        int solution = binaryGap.solution(51712);
        int expectedSolution = 2;
        Assert.assertEquals(expectedSolution, solution);
    }

}
