package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.MatrixSet0;

public class MatricSet0Test {

    private MatrixSet0 matrixSet0 = new MatrixSet0();

    @Test
    public void test() {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[] { 4, 1, 2, 2 };
        matrix[1] = new int[] { 0, 4, 5, 3 };
        matrix[2] = new int[] { 6, 7, 8, 4 };

        int[][] expectedMatrix = new int[3][3];
        expectedMatrix[0] = new int[] { 0, 1, 2, 2 };
        expectedMatrix[1] = new int[] { 0, 0, 0, 0 };
        expectedMatrix[2] = new int[] { 0, 7, 8, 4 };

        matrixSet0.set0(matrix);
        Assert.assertArrayEquals(expectedMatrix, matrix);
    }

}
