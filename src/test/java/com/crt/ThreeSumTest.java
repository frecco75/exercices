package com.crt;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.crt.ThreeSum;
import com.crt.Triplet;


public class ThreeSumTest {

    private ThreeSum threeSum = new ThreeSum();

    @Test
    public void solution_test() {
        int[] A = new int[] {-1, 0, 1, 2, -1, -4};
        Set<Triplet> expectedSolution = new HashSet<Triplet>();
        expectedSolution.add(new Triplet(-1, 0, 1));
        expectedSolution.add(new Triplet(-1, -1, 2));

        Set<Triplet> solution = threeSum.basicSolution(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void solution_test2() {
        int[] A = new int[] {-1, 0, 1, 2, -1, -4};
        Set<Triplet> expectedSolution = new HashSet<Triplet>();
        expectedSolution.add(new Triplet(-1, 0, 1));
        expectedSolution.add(new Triplet(-1, -1, 2));

        Set<Triplet> solution = threeSum.solution(A);
        Assert.assertEquals(expectedSolution, solution);
    }


}
