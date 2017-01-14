package com.codility.lessons.counting_elements;

import org.junit.Assert;
import org.junit.Test;

public class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void test() {
        int[] A = new int[] { 3, 4, 4, 6, 1, 4, 4 };
        int[] expected = new int[] { 3, 2, 2, 4, 2 };
        int[] solution = maxCounters.solution(5, A);
        Assert.assertArrayEquals(expected, solution);
    }
}
