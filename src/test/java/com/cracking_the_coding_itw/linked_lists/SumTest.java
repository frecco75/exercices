package com.cracking_the_coding_itw.linked_lists;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.data.LinkedList;
import com.craking_the_coding_itw.linked_lists.Sum;

public class SumTest {

    private Sum sum = new Sum();

    @Test
    public void test_with_standard_library() {
        List<Integer> lstA = Arrays.asList(3, 1, 5);
        List<Integer> lstB = Arrays.asList(5, 9, 2);
        List<Integer> expected = Arrays.asList(8, 0, 8);
        List<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

    @Test
    public void test_differents_size_with_standard_library() {
        List<Integer> lstA = Arrays.asList(3, 1);
        List<Integer> lstB = Arrays.asList(5, 9, 2);
        List<Integer> expected = Arrays.asList(8, 0, 3);
        List<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

    @Test
    public void test_end_overflow_with_standard_library() {
        List<Integer> lstA = Arrays.asList(3, 9, 9);
        List<Integer> lstB = Arrays.asList(5, 9, 9);
        List<Integer> expected = Arrays.asList(8, 8, 9, 1);
        List<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

    @Test
    public void test_with_custom_linked_list() {
        LinkedList<Integer> lstA = new LinkedList<Integer>(3, 1, 5);
        LinkedList<Integer> lstB = new LinkedList<Integer>(5, 9, 2);
        LinkedList<Integer> expected = new LinkedList<Integer>(8, 0, 8);
        LinkedList<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

    @Test
    public void test_differents_size_with_custom_linked_list() {
        LinkedList<Integer> lstA = new LinkedList<Integer>(3, 1);
        LinkedList<Integer> lstB = new LinkedList<Integer>(5, 9, 2);
        LinkedList<Integer> expected = new LinkedList<Integer>(8, 0, 3);
        LinkedList<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

    @Test
    public void test_end_overflow_with_custom_linked_list() {
        LinkedList<Integer> lstA = new LinkedList<Integer>(3, 9, 9);
        LinkedList<Integer> lstB = new LinkedList<Integer>(5, 9, 9);
        LinkedList<Integer> expected = new LinkedList<Integer>(8, 8, 9, 1);
        LinkedList<Integer> solution = sum.sum(lstA, lstB);
        Assert.assertEquals(expected, solution);
    }

}
