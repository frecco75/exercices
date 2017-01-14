package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void tapeEquilibrium_test() {
        int[] A = new int[] {3, 1, 2, 4, 3};
        int expectedSolution = 1;
        int solution = tapeEquilibrium.tapeEquilibrium(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void tapeEquilibrium_trivial_test() {
        int[] A = new int[] {1000, -1000};
        int expectedSolution = 2000;
        int solution = tapeEquilibrium.tapeEquilibrium(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
