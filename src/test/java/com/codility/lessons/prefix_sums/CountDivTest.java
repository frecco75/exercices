package com.codility.lessons.prefix_sums;

import org.junit.Assert;
import org.junit.Test;

public class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    public void test() {
        int A=6;
        int B=11;
        int K=2;
        int expectedSolution = 3;
        int solution = countDiv.solution(A, B, K);
        Assert.assertEquals(expectedSolution, solution);
    }

}
