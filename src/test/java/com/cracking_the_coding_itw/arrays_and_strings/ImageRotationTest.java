package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.ImageRotation;

public class ImageRotationTest {

    private ImageRotation imageRotation = new ImageRotation();

    @Test
    public void test() {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[] { 0, 1, 2 };
        matrix[1] = new int[] { 3, 4, 5 };
        matrix[2] = new int[] { 6, 7, 8 };

        int[][] expectedMatrix = new int[3][3];
        expectedMatrix[0] = new int[] { 6, 3, 0 };
        expectedMatrix[1] = new int[] { 7, 4, 1 };
        expectedMatrix[2] = new int[] { 8, 5, 2 };

        imageRotation.rotate(matrix);
        Assert.assertArrayEquals(expectedMatrix, matrix);
    }

}
