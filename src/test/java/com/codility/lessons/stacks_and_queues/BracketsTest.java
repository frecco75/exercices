package com.codility.lessons.stacks_and_queues;

import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    private Brackets brackets = new Brackets();

    @Test
    public void success_test() {
        String S = "{[()()]}";
        int expectedSolution = 1;
        int solution = brackets.solution(S);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void empty_test() {
        String S = "";
        int expectedSolution = 1;
        int solution = brackets.solution(S);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void failure_test() {
        String S = "([)()]";
        int expectedSolution = 0;
        int solution = brackets.solution(S);
        Assert.assertEquals(expectedSolution, solution);
    }

}
