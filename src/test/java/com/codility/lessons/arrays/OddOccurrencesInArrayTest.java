package com.codility.lessons.arrays;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void test() {
        int[] A = new int[] { 9, 3, 9, 3, 9, 7, 9 };
        int solution = oddOccurrencesInArray.solution(A);
        int expectedSolution = 7;

        Assert.assertEquals(solution, expectedSolution);

    }

}
