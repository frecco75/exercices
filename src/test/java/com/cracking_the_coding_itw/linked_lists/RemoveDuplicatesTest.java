package com.cracking_the_coding_itw.linked_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.data.LinkedList;
import com.craking_the_coding_itw.linked_lists.RemoveDuplicates;


public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void test_with_standard_structure() {
        List<Integer> L = new ArrayList<Integer>(Arrays.asList(10, 2, 3, 2, 8, 2)); // nécessaire pour pouvoir supprimer un élément (Arrays.asList = liste de taille FIXE)
        List<Integer> expected = Arrays.asList(10, 2, 3, 8);
        removeDuplicates.removeDuplicates(L);
        Assert.assertEquals(expected, L);
    }

    @Test
    public void test_with_custom_linkedlist() {
        LinkedList<Integer> L = new LinkedList<Integer>(10, 2, 3, 2, 8, 2);
        LinkedList<Integer> expected = new LinkedList<Integer>(10, 2, 3, 8);
        removeDuplicates.removeDuplicates(L);
        Assert.assertEquals(expected, L);
    }

}
