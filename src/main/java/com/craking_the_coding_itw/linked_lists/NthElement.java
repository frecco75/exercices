package com.craking_the_coding_itw.linked_lists;

import java.util.List;

import com.craking_the_coding_itw.data.LinkedList;

/**
 * Implements an algorithm to find the nth to last element of a singly linked list
 *
 * @author fabienrecco
 *
 */
public class NthElement {

    /**
     * Solution en O(1)
     * @param lst
     * @param index
     * @return
     */
    public <E> E findNthToLastElement(final List<E> lst, final int index) {
        E element = null;
        if(lst != null) {
            if(index > 0 && index <= lst.size()) {
                int length = lst.size();
                int position = length - index;
                element = lst.get(position);
            }
        }
        return element;
    }

    /**
     * Solution en O(n)
     * @param lst
     * @param index
     * @return
     */
    public <E> E findNthToLastElement(final LinkedList<E> lst, final int index) {
        E element = null;
        LinkedList<E> cursor = lst;

        if(lst != null && index > 0) {
            for(int i=0; i<index; ++i) {
                if(cursor == null) {
                    return null; // lst.length < index
                }
                cursor = cursor.getNext();
            }

            LinkedList<E> cursor2 = lst;
            while(cursor != null) {
                cursor = cursor.getNext();
                cursor2 = cursor2.getNext();
            }
            element = cursor2.getData();
        }

        return element;
    }

}
