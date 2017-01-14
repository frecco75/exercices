package com.craking_the_coding_itw.linked_lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.craking_the_coding_itw.data.LinkedList;

/**
 * Write code to remove duplicates from an unsorted linked list
 *
 * @author fabienrecco
 *
 */
public class RemoveDuplicates {

    /**
     * Solution en O(n)
     * @param l
     */
    public void removeDuplicates(final List<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        Iterator<Integer> ite = l.iterator();
        while(ite.hasNext()) {
            Integer i = ite.next();
            if(! set.add(i)) {
                ite.remove();
            }
        }
    }

    /**
     * Solution en O(n)
     * @param l
     */
    public void removeDuplicates(final LinkedList<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        LinkedList<Integer> prevCursor = null;
        LinkedList<Integer> cursor = l;
        while(cursor != null) {
            Integer elt = cursor.getData();
            if(! set.add(elt) && prevCursor != null) {
                prevCursor.setNext(cursor.getNext());
            }
            prevCursor = cursor;
            cursor = cursor.getNext();
        }
    }

}
