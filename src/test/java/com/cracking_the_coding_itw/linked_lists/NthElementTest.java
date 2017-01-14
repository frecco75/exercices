package com.cracking_the_coding_itw.linked_lists;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.data.LinkedList;
import com.craking_the_coding_itw.linked_lists.NthElement;

public class NthElementTest {

    private NthElement nthElement = new NthElement();

    @Test
    public void test_with_standard_library() {
        List<Integer> lst = Arrays.asList(8, 10, 5, 7, 2);
        Integer expected = 7;
        Integer element = nthElement.findNthToLastElement(lst, 2);
        Assert.assertEquals(expected, element);
    }

    @Test
    public void test_with_custom_linked_list() {
        LinkedList<Integer> lst = new LinkedList<Integer>(8, 10, 5, 7, 2);
        Integer expected = 7;
        Integer element = nthElement.findNthToLastElement(lst, 2);
        Assert.assertEquals(expected, element);
    }

}
