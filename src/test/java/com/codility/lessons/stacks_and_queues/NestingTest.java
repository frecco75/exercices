package com.codility.lessons.stacks_and_queues;

import org.junit.Assert;
import org.junit.Test;

public class NestingTest {

    private Nesting nesting = new Nesting();

    @Test
    public void success_test() {
        String S = "(()(())())";
        int expectedSolution = 1;
        int solution = nesting.solution(S);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void failure_test() {
        String S = "())";
        int expectedSolution = 0;
        int solution = nesting.solution(S);
        Assert.assertEquals(expectedSolution, solution);
    }

}
