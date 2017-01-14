package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class EquilibriumTest {

    private Equilibrium equilibrium = new Equilibrium();

    @Test
    public void equilibrium_test() {
        int[] A = new int[] {-1, 3, -4, 5, 1, -6, 2, 1};
        int expectedSolution = 1;
        int solution = equilibrium.equilibrium(A);
        Assert.assertEquals(expectedSolution, solution);
    }

    @Test
    public void equilibrium_test2() {
        int[] A = new int[] {-1, 0};
        int expectedSolution = 0;
        int solution = equilibrium.equilibrium(A);
        Assert.assertEquals(expectedSolution, solution);
    }

}
