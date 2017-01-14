package com.cracking_the_coding_itw.linked_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.data.LinkedList;
import com.craking_the_coding_itw.linked_lists.DeleteNode;


public class DeleteNodeTest {

    private DeleteNode deleteNode = new DeleteNode();

    @Test
    public void test_with_standard_library() {
        List<String> lst = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));
        List<String> expected = new ArrayList<String>(Arrays.asList("a", "b", "d", "e"));
        deleteNode.process(lst);
        Assert.assertEquals(expected, lst);
    }

    @Test
    public void test_with_custom_linked_list() {
        LinkedList<String> lst = new LinkedList<String>("a", "b", "c", "d", "e");
        LinkedList<String> middle = lst.getNext().getNext();
        LinkedList<String> expected = new LinkedList<String>("a", "b", "d", "e");
        deleteNode.process(middle);
        Assert.assertEquals(expected, lst);
    }

}
