package com.codility.lessons.prime_and_composite_numbers;

import org.junit.Assert;
import org.junit.Test;

public class CountFactorsTest {

    private CountFactors countFactors = new CountFactors();

    @Test
    public void test() {
        int N = 24;
        int expectedSolution = 8;
        int solution = countFactors.solution(N);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void test_25() {
        int N = 25;
        int expectedSolution = 3;
        int solution = countFactors.solution(N);
        Assert.assertEquals(expectedSolution, solution);
    }

}
