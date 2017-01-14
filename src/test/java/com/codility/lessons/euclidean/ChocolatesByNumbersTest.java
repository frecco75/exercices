package com.codility.lessons.euclidean;

import org.junit.Assert;
import org.junit.Test;

public class ChocolatesByNumbersTest {

    private ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();

    @Test
    public void test() {
        int N=10;
        int M=4;
        int expectedSolution = 5;
        int solution = chocolatesByNumbers.solution(N, M);
        Assert.assertEquals(expectedSolution, solution);
    }

}
