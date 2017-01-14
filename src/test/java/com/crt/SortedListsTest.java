package com.crt;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.crt.SortedLists;


public class SortedListsTest {

    SortedLists sortedLists = new SortedLists();

    @Test
    public void check_linear() {
        int[] arr1 = new int[] { 1, 2, 6 };
        int[] arr2 = new int[] { 3, 4, 7 };
        int[] expectedArr = new int[] { 1, 2, 3, 4, 6, 7 };

        int[] arr = sortedLists.linearMerge(arr1, arr2);
        Assert.assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void check_integer_list() {
        List<Integer> l1 = Arrays.asList(new Integer[] { 1, 2, 3, 6 });
        List<Integer> l2 = Arrays.asList(new Integer[] { 3, 4, 7 });
        List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 2, 3, 3, 4, 6, 7 });

        List<Integer> l = sortedLists.merge(l1, l2);
        Assert.assertEquals(expectedList, l);
    }

    @Test
    public void check_linear_integer_list() {
        List<Integer> l1 = Arrays.asList(new Integer[] { 1, 2, 3, 6 });
        List<Integer> l2 = Arrays.asList(new Integer[] { 3, 4, 7 });
        List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 2, 3, 3, 4, 6, 7 });

        List<Integer> l = sortedLists.linearMerge(l1, l2);
        Assert.assertEquals(expectedList, l);
    }

    @Test
    public void check_Character_list() {
        List<Character> l1 = Arrays.asList(new Character[] { 'a', 'b', 'e'});
        List<Character> l2 = Arrays.asList(new Character[] { 'c', 'd', 'z'});
        List<Character> expectedList = Arrays.asList(new Character[] { 'a', 'b', 'c', 'd', 'e', 'z'});

        List<Character> l = sortedLists.linearMerge(l1, l2);
        Assert.assertEquals(expectedList, l);
    }

}
