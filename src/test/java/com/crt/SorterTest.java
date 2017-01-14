package com.crt;

import org.junit.Assert;
import org.junit.Test;

import com.crt.Sorter;

public class SorterTest {

    private enum Sort { BUBBLE, SELECTION, MERGE, QUICK }
    private Sorter sorter = new Sorter();

    @Test
    public void bubble_sort_test() {
        sortTest(Sort.BUBBLE);
    }

    @Test
    public void selection_sort_test() {
        sortTest(Sort.SELECTION);
    }

    @Test
    public void merge_sort_test() {
        sortTest(Sort.MERGE);
    }

    @Test
    public void quick_sort_test() {
        sortTest(Sort.QUICK);
    }

    private void sortTest(final Sort sort) {
        int[] A = new int[] { 3, 2, 1, 6, 5, 4 };
        int[] expectedSolution = new int[] { 1, 2, 3, 4, 5, 6 };

        if(sort != null) {
            switch(sort) {
                case BUBBLE    : sorter.bubbleSort(A);     break;
                case SELECTION : sorter.selectionSort(A);  break;
                case MERGE     : sorter.mergeSort(A);      break;
                case QUICK     : sorter.quickSort(A);      break;
            }
        }

        Assert.assertArrayEquals(expectedSolution, A);
    }

}
