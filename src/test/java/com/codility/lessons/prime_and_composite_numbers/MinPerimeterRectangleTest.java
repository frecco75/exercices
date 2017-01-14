package com.codility.lessons.prime_and_composite_numbers;

import org.junit.Assert;
import org.junit.Test;

public class MinPerimeterRectangleTest {

    private MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();

    @Test
    public void test() {
        int N = 30;
        int expectedSolution = 22;
        int solution = minPerimeterRectangle.solution(N);
        Assert.assertEquals(expectedSolution, solution);
    }

}
