package com.codility.lessons.time_complexity;

import org.junit.Assert;
import org.junit.Test;


public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void test() {
        int expectedSolution = 3;
        int solution = frogJmp.solution(10, 85, 30);
        Assert.assertEquals(expectedSolution, solution);
    }
}
